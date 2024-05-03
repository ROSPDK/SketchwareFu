
package mod.fufufu.editor.view.palette;

import android.content.Context;
import com.besome.sketch.beans.TextBean;
import com.besome.sketch.beans.ViewBean;
import com.besome.sketch.editor.view.palette.IconBase;
import com.sketchware.remod.R;

public class IconMaterialSlider extends IconBase {
    public IconMaterialSlider(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
        setWidgetImage(R.drawable.widget_mslider);
        setWidgetName("MaterialSlider");
    }

    public ViewBean getBean() {
        ViewBean viewBean = new ViewBean();
        viewBean.type = 49;
        viewBean.layout.orientation = 1;
        viewBean.layout.width = -1;
        viewBean.layout.gravity = 17;
        viewBean.layout.paddingLeft = 8;
        viewBean.layout.paddingTop = 8;
        viewBean.layout.paddingRight = 8;
        viewBean.layout.paddingBottom = 8;
        TextBean textBean = viewBean.text;
        viewBean.text.text = getName();
        viewBean.convert = "com.google.android.material.slider.Slider";
        viewBean.inject = "android:valueFrom=\"0.0\"\nandroid:valueTo=\"100.0\"\nandroid:value=\"0\"";
        return viewBean;
    }
}