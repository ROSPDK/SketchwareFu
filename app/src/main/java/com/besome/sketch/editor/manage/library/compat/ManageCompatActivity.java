package com.besome.sketch.editor.manage.library.compat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.widget.Toolbar;

import com.besome.sketch.beans.ProjectLibraryBean;
import com.besome.sketch.lib.base.BaseAppCompatActivity;
import com.sketchware.remod.databinding.ManageLibraryManageCompatBinding;
import com.sketchware.remod.R;

import a.a.a.aB;
import mod.hey.studios.util.Helper;

public class ManageCompatActivity extends BaseAppCompatActivity implements View.OnClickListener {

    private ManageLibraryManageCompatBinding binding;
    private ProjectLibraryBean compatLibraryBean;
    private ProjectLibraryBean firebaseLibraryBean;

    private void showFirebaseNeedDisableDialog() {
        aB dialog = new aB(this);
        dialog.a(R.drawable.chrome_96);
        dialog.a(Helper.getResString(R.string.design_library_appcompat_need_firebase_disable));
        dialog.b(Helper.getResString(R.string.common_word_ok), (d, which) -> Helper.getDialogDismissListener(d));
        dialog.show();
    }

    private void configureLibraryDialog() {
        aB dialog = new aB(this);
        dialog.b(Helper.getResString(R.string.common_word_warning));
        dialog.a(R.drawable.delete_96);
        dialog.a(Helper.getResString(R.string.design_library_message_confirm_uncheck_appcompat_and_design));
        dialog.setCancelable(false);
        dialog.b(Helper.getResString(R.string.common_word_delete), (d, which) -> {
            binding.libSwitch.setChecked(false);
            d.dismiss();
        });
        dialog.a(Helper.getResString(R.string.common_word_cancel), (d, which) -> {
            binding.libSwitch.setChecked(true);
            d.dismiss();
        });
        dialog.show();
    }

    private void configure() {
        binding.libSwitch.setChecked("Y".equals(compatLibraryBean.useYn));
    }

    @Override
    public void onBackPressed() {
        compatLibraryBean.useYn = binding.libSwitch.isChecked() ? "Y" : "N";
        Intent intent = new Intent();
        intent.putExtra("compat", compatLibraryBean);
        setResult(RESULT_OK, intent);
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == binding.layoutSwitch.getId()) {
            binding.libSwitch.setChecked(!binding.libSwitch.isChecked());
            if (!binding.libSwitch.isChecked() && "Y".equals(firebaseLibraryBean.useYn)) {
                showFirebaseNeedDisableDialog();
                binding.libSwitch.setChecked(true);
                return;
            }

            if ("Y".equals(compatLibraryBean.useYn) && !binding.libSwitch.isChecked()) {
                configureLibraryDialog();
            }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        EdgeToEdge.enable(this);
        super.onCreate(savedInstanceState);
        binding = ManageLibraryManageCompatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);
        getSupportActionBar().setTitle(Helper.getResString(R.string.design_library_title_appcompat_and_design));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        binding.toolbar.setNavigationOnClickListener(Helper.getBackPressedClickListener(this));

        compatLibraryBean = getIntent().getParcelableExtra("compat");
        firebaseLibraryBean = getIntent().getParcelableExtra("firebase");
        binding.layoutSwitch.setOnClickListener(this);
        binding.tvDesc.setText(Helper.getResString(R.string.design_library_appcompat_description));
        binding.tvEnable.setText(Helper.getResString(R.string.design_library_settings_title_enabled));
        binding.tvWarning.setText(Helper.getResString(R.string.design_library_message_slow_down_compilation_time));
        configure();
    }
}
