
package mod.fufufu.editor.view.item;

import a.a.a.sy;
import a.a.a.wB;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.besome.sketch.beans.ViewBean;
import com.sketchware.remod.R;

public class ItemMaterialFab extends LinearLayout implements sy {
    private boolean hasFixed;
    private boolean hasSelection;
    private float paddingFactor;
    private Paint paint;
    private final Rect rect = new Rect();
    private ViewBean viewBean;

    public ItemMaterialFab(Context context) {
        super(context);
        paddingFactor = wB.a(context, 1.0f);
        paint = new Paint(1);
        paint.setColor(0x9599d5d0);
        setDrawingCacheEnabled(true);
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LayoutParams(-1, -2));
        imageView.setImageResource(R.drawable.item_material_fab);
        imageView.setScaleType(ScaleType.FIT_XY);
        imageView.setPadding(0, 0, 0, 0);
        addView(imageView);
        setGravity(17);
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
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRect(rect, paint);
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