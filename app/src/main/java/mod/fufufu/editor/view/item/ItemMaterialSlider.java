
package mod.fufufu.editor.view.item;

import a.a.a.sy;
import a.a.a.wB;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.besome.sketch.beans.ViewBean;

public class ItemMaterialSlider extends AppCompatSeekBar implements sy {
    public ViewBean viewBean;
    public boolean hasSelection;
    public boolean hasFixed;
    public Paint paint;
    public float paddingFactor;

    public ItemMaterialSlider(Context context) {
        super(context);
        initialize(context);
    }

    public void initialize(Context context) {
        paddingFactor = wB.a(context, 1.0f);
        paint = new Paint(1);
        paint.setColor(0x9599d5d0);
        setDrawingCacheEnabled(true);
    }

    @Override
    public ViewBean getBean() {
        return viewBean;
    }

    @Override
    public boolean getFixed() {
        return hasFixed;
    }

    @Override
    public boolean getSelection() {
        return hasSelection;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (hasSelection) {
            canvas.drawRect(new Rect(0, 0, getMeasuredWidth(), getMeasuredHeight()), e);
        }
        super.onDraw(canvas);
    }

    @Override
    public void setBean(ViewBean viewBean) {
        viewBean = viewBean;
    }

    @Override
    public void setFixed(boolean isFixed) {
        hasFixed = isFixed;
    }

    @Override
   public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(
                (int) (left * paddingFactor), (int) (top * paddingFactor),
                (int) (right * paddingFactor), (int) (bottom * paddingFactor));
    }

    @Override
    public void setSelection(boolean selection) {
        hasSelection = selection;
        invalidate();
    }
}