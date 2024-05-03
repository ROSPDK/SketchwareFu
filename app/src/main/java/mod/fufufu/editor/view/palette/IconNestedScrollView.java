
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.LayoutBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconNestedScrollView extends IconBase {
    public IconNestedScrollView(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_scrollview);
        setWidgetName("NestedScrollView");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 12;
        LayoutBean layoutBean = viewBean.layout;
        layoutBean.width = -1;
        layoutBean.paddingLeft = 8;
        layoutBean.paddingTop = 8;
        layoutBean.paddingRight = 8;
        layoutBean.paddingBottom = 8;
        viewBean.convert = "androidx.core.widget.NestedScrollView";
        return viewBean;
    }
}