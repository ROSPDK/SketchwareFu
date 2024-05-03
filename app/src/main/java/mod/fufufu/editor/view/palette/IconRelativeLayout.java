
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconRelativeLayout extends IconBase {
    public IconRelativeLayout(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_relative);
        setWidgetName("RelativeLayout");
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
        viewBean.convert = "RelativeLayout";
        return viewBean;
    }
}