package rs.f16csc413p2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.Random;

/**
 * A concrete instance of Shape as a circle.  Can be drawn to a View.  Implements
 * onDraw(Canvas).
 *
 * Code for Circle is given as an example, you must write Rectangle and Picture
 */
public class Circle extends Shape {

    /**
     * Constructor
     * @param context Current application context.
     */
    public Circle(Context context){
        super(context);
    }

    /**
     * Called when canvas is redrawn.  Draws a circle of random size,
     * fill color and border color onto the canvas.
     *
     * @param canvas the canvas onto which the circle will be drawn.
     */
    public void onDraw(Canvas canvas) {
        Random rand = new Random();

        int red = rand.nextInt(255);
        int grn = rand.nextInt(255);
        int blu = rand.nextInt(255);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        int cx = rand.nextInt(width)+1;
        int cy = rand.nextInt(height)+1;
        int cr = (rand.nextInt(width)/3)+5;


        paint.setColor(Color.rgb(red,grn,blu));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(cx, cy, cr, paint);
    }

    /**
     * Returns the current Shape type as a ShapeType.
     *
     * @return ShapeType.CIRCLE
     */
    public ShapeType getShapeType(){ return ShapeType.CIRCLE; }
}