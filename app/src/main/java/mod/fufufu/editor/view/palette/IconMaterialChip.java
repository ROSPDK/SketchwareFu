
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialChip extends IconBase {
    public IconMaterialChip(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mchip);
        setWidgetName("MaterialChip");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 52;
        viewBean.layout.orientation = 1;
        viewBean.layout.gravity = 17;
        viewBean.layout.paddingLeft = 8;
        viewBean.layout.paddingTop = 8;
        viewBean.layout.paddingRight = 8;
        viewBean.layout.paddingBottom = 8;
        viewBean.text.text = getName();
        viewBean.convert = "com.google.android.material.chip.Chip";
        viewBean.inject = "style=\"@style/Widget.MaterialComponents.Chip.Choice\"";
        return viewBean;
    }
}