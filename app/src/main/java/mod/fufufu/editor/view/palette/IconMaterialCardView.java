
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialCardView extends IconBase {
    public IconMaterialCardView(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mcard);
        setWidgetName("MaterialCardView");
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
        viewBean.convert = "com.google.android.material.card.MaterialCardView";
        viewBean.inject = "app:cardElevation=\"@null\"\napp:cardCornerRadius=\"10dp\"\napp:strokeColor=\"#00000000\"\napp:strokeWidth=\"0dp\"";
        return viewBean;
    }
}