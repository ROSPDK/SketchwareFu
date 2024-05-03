
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialChipGroup extends IconBase {
    public IconMaterialChipGroup(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mchipgroup);
        setWidgetName("MaterialChipGroup");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 0;
        viewBean.layout.orientation = 1;
        viewBean.layout.width = -1;
        viewBean.layout.paddingLeft = 8;
        viewBean.layout.paddingTop = 8;
        viewBean.layout.paddingRight = 8;
        viewBean.layout.paddingBottom = 8;
        viewBean.convert = "com.google.android.material.chip.ChipGroup";
        viewBean.inject = "app:singleSelection=\"true\"";
        return viewBean;
    }
}