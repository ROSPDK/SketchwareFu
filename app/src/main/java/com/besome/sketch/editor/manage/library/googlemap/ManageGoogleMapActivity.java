package com.besome.sketch.editor.manage.library.googlemap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.materialswitch.MaterialSwitch;


import androidx.appcompat.widget.Toolbar;

import com.besome.sketch.beans.ProjectLibraryBean;
import com.besome.sketch.lib.base.BaseAppCompatActivity;
import com.sketchware.remod.R;

import a.a.a.GB;
import a.a.a.aB;
import a.a.a.bB;
import a.a.a.iC;
import a.a.a.mB;
import mod.hey.studios.util.Helper;
import mod.jbk.editor.manage.library.LibrarySettingsImporter;

public class ManageGoogleMapActivity extends BaseAppCompatActivity implements View.OnClickListener {
    private String sc_id;
    private MaterialSwitch libSwitch;
    private EditText editApiKey;
    private ProjectLibraryBean googleMapLibraryBean;

    private void openDoc() {
        if (GB.h(getApplicationContext())) {
            try {
                Uri documentationUrl = Uri.parse("https://developers.google.com/maps/documentation/android-sdk/signup");
                Intent openDocIntent = new Intent(Intent.ACTION_VIEW);
                openDocIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                openDocIntent.setData(documentationUrl);
                openDocIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                openDocIntent.addFlags(Intent.FLAG_GRANT_WRITE_URI_PERMISSION);
                openDocIntent.addFlags(Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
                startActivity(openDocIntent);
            } catch (Exception e) {
                e.printStackTrace();
                downloadChromeDialog();
            }
        } else {
            bB.a(getApplicationContext(), Helper.getResString(R.string.common_message_check_network), 0).show();
        }
    }

    private void downloadChromeDialog() {
        final aB dialog = new aB(this);
        dialog.a(R.drawable.chrome_96);
        dialog.b(Helper.getResString(R.string.title_compatible_chrome_browser));
        dialog.a(Helper.getResString(R.string.message_compatible_chrome_brower));
        dialog.b(Helper.getResString(R.string.common_word_ok), v -> {
            if (!mB.a()) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.android.chrome"));
                startActivity(intent);
                dialog.dismiss();
            }
        });
        dialog.a(Helper.getResString(R.string.common_word_cancel), Helper.getDialogDismissListener(dialog));
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        googleMapLibraryBean.useYn = libSwitch.isChecked() ? "Y" : "N";
        googleMapLibraryBean.data = editApiKey.getText().toString();
        intent.putExtra("google_map", googleMapLibraryBean);
        setResult(RESULT_OK, intent);
        if (editApiKey.getText().toString().isEmpty() && libSwitch.isChecked()) {
            bB.a(getApplicationContext(), "Api key can't be empty!", Toast.LENGTH_SHORT).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.btn_import) {
            LibrarySettingsImporter importer = new LibrarySettingsImporter(sc_id, iC::e);
            importer.addOnProjectSelectedListener(settings -> {
                googleMapLibraryBean = settings;
                configure();
            });
            importer.showDialog(this);
        } else if (id == R.id.btn_open_doc) {
            openDoc();
        } else if (id == R.id.layout_switch) {
            libSwitch.setChecked(!libSwitch.isChecked());
            if ("Y".equals(googleMapLibraryBean.useYn) && !libSwitch.isChecked()) {
                configureLibrary();
            }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manage_library_manage_googlemap);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findViewById(R.id.layout_main_logo).setVisibility(View.GONE);
        if (savedInstanceState == null) {
            sc_id = getIntent().getStringExtra("sc_id");
            googleMapLibraryBean = getIntent().getParcelableExtra("google_map");
        } else {
            sc_id = savedInstanceState.getString("sc_id");
            googleMapLibraryBean = savedInstanceState.getParcelable("google_map");
        }

        getSupportActionBar().setTitle("GoogleMap Settings");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        toolbar.setNavigationOnClickListener(Helper.getBackPressedClickListener(this));
        LinearLayout switchLayout = findViewById(R.id.layout_switch);
        switchLayout.setOnClickListener(this);
        libSwitch = findViewById(R.id.switch_lib);
        editApiKey = findViewById(R.id.ed_api_key);
        ((TextView) findViewById(R.id.tv_api_key)).setText(Helper.getResString(R.string.design_library_google_map_title_api_key));
        ((TextView) findViewById(R.id.tv_desc)).setText(Helper.getResString(R.string.design_library_google_maps_description_operate_normally));
        ((TextView) findViewById(R.id.tv_enable)).setText(Helper.getResString(R.string.design_library_settings_title_enabled));
        Button btnImport = findViewById(R.id.btn_import);
        btnImport.setText(Helper.getResString(R.string.design_library_button_import_from_other_project));
        btnImport.setOnClickListener(this);
        Button btnOpenDoc = findViewById(R.id.btn_open_doc);
        btnOpenDoc.setText(Helper.getResString(R.string.design_library_google_map_button_open_doc));
        btnOpenDoc.setOnClickListener(this);
        configure();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString("sc_id", sc_id);
        outState.putParcelable("google_map", googleMapLibraryBean);
        super.onSaveInstanceState(outState);
    }

    private void configureLibrary() {
        aB dialog = new aB(this);
        dialog.b(Helper.getResString(R.string.common_word_warning));
        dialog.a(R.drawable.delete_96);
        dialog.a(Helper.getResString(R.string.design_library_message_confirm_uncheck_google_map));
        dialog.setCancelable(false);
        dialog.b(Helper.getResString(R.string.common_word_delete), v -> {
            libSwitch.setChecked(false);
            dialog.dismiss();
        });
        dialog.a(Helper.getResString(R.string.common_word_cancel), v -> {
            libSwitch.setChecked(true);
            dialog.dismiss();
        });
        dialog.show();
    }

    private void configure() {
        libSwitch.setChecked("Y".equals(googleMapLibraryBean.useYn));
        editApiKey.setText(googleMapLibraryBean.data);
    }
}