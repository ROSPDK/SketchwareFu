package mod.fufufu.editor.manage.library;

import static android.text.TextUtils.isEmpty;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.materialswitch.MaterialSwitch;
import android.widget.TextView;
import com.sketchware.remod.databinding.ManageAdvancedFirebasePreviewBinding;
import com.besome.sketch.beans.ProjectLibraryBean;
import a.a.a.nv;
import a.a.a.gB;
import a.a.a.wB;
import com.sketchware.remod.R;
import mod.hey.studios.util.Helper;

public class AdvancedFirebaseReviewStep extends LinearLayout implements nv {
public AdvancedFirebaseReviewStep(Context context) {
        super(context);
        initialize(context);
}
private void initialize(Context context) {
binding = ManageAdvancedFirebasePreviewBinding.inflate(LayoutInflater.from(context), this, true);
        binding.getRoot();
        gB.b(this, 600, 200, null);
  binding.layoutSwitch.setOnClickListener(view -> binding.libSwitch.setChecked(!binding.libSwitch.isChecked()));
        
}
  @Override
    public void a(ProjectLibraryBean projectLibraryBean) {
        if (binding.libSwitch.isChecked()) {
            projectLibraryBean.useYn = "Y";
        } else {
            projectLibraryBean.useYn = "N";
        }
   }
    @Override
    public String getDocUrl() {
        return "";
    }

    @Override
    public boolean isValid() {
        return true;
    }
    @Override
    public void setData(ProjectLibraryBean projectLibraryBean) {
    binding.tvProjectId.setText(projectLibraryBean.data);
        binding.tvAppId.setText(projectLibraryBean.reserved1);
        binding.tvApiKey.setText(projectLibraryBean.reserved2);
        binding.tvStorageUrl.setText(projectLibraryBean.reserved3);
        binding.libSwitch.setChecked(true);
    }
}
