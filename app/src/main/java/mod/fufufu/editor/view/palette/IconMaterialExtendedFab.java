
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.LayoutBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialExtendedFab extends IconBase {
    public IconMaterialExtendedFab(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_xfab);
        setWidgetName("MaterialExtendedFab");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 57;
        viewBean.layout.orientation = 1;
        viewBean.layout.width = -2;
        viewBean.layout.marginLeft = 16;
        viewBean.layout.marginTop = 16;
        viewBean.layout.marginRight = 16;
        LayoutBean layoutBean = viewBean.layout;
        layoutBean.marginBottom = 16;
        layoutBean.paddingLeft = 0;
        viewBean.layout.paddingTop = 0;
        viewBean.layout.paddingRight = 0;
        viewBean.layout.paddingBottom = 0;
        viewBean.convert = "com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton";
        viewBean.inject = "android:text=\"Extended\"\napp:icon=\"@drawable/material_ic_edit_black_24dp\"\napp:shapeAppearance=\"@style/ShapeAppearanceOverlay.Material3.FloatingActionButton\"\napp:iconTint=\"?attr/colorOnPrimaryContainer\"\nstyle=\"?attr/floatingActionButtonTertiaryStyle\"";
        return viewBean;
    }
}