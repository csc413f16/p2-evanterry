package rs.f16csc413p2;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.Context;
import android.view.View;

/**
 * Created by marc on 3/7/16.
 */


public abstract class Shape extends View {
    int alpha = 0;
    Paint paint = new Paint();

    public Shape(Context context){
        super(context);
    };

    void setShapeAlpha(float alpha){
        this.setAlpha(alpha);
    }

    float getShapeAlpha(){
        return this.getAlpha();
    }

    void removeShape(){
        this.setVisibility(GONE);
    }

    abstract ShapeType getShapeType();

    @Override
    public abstract void onDraw(Canvas canvas);
}
