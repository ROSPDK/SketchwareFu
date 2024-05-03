
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialSwitch extends IconBase {
    public IconMaterialSwitch(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mswitch);
        setWidgetName("MaterialSwitch");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 53;
        viewBean.layout.orientation = 1;
        viewBean.layout.gravity = 17;
        viewBean.layout.paddingLeft = 8;
        viewBean.layout.paddingTop = 8;
        viewBean.layout.paddingRight = 8;
        viewBean.layout.paddingBottom = 8;
        viewBean.text.text = getName();
        viewBean.convert = "com.google.android.material.materialswitch.MaterialSwitch";
        viewBean.inject = "app:switchPadding=\"8dp\"\nstyle=\"@style/Widget.Material3.CompoundButton.MaterialSwitch\"";
        return viewBean;
    }
}