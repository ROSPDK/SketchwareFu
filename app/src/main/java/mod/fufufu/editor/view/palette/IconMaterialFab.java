
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.LayoutBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialFab extends IconBase {
    public IconMaterialFab(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mfab);
        setWidgetName("MaterialFab");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 58;
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
        viewBean.convert = "com.google.android.material.floatingactionbutton.FloatingActionButton";
        viewBean.inject = "app:srcCompat=\"@drawable/material_ic_edit_black_24dp\"\napp:shapeAppearance=\"@style/ShapeAppearanceOverlay.Material3.FloatingActionButton\"\napp:tint=\"?attr/colorOnPrimaryContainer\"\nstyle=\"?attr/floatingActionButtonTertiaryStyle\"";
        return viewBean;
    }
}