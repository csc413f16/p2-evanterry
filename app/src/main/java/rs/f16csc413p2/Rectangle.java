package rs.f16csc413p2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;

import java.util.Random;


/**
 * A concrete instance of Shape as a rectangle.  Can be drawn to a View.  Implements
 * onDraw(Canvas).
 *
 * See Circle for implementation details
 */
public class Rectangle extends Shape {

    /**
     * Constructor
     * @param context Current application context.
     */
    public Rectangle(Context context){
        super(context);
    }

    /**
     * A concrete instance of Shape as a rectangle.  Can be drawn to a View.  Implements
     * onDrawe(Canvas).
     *
     * @param canvas the canvas onto which the rectangle will be drawn.
     *
     */
    public void onDraw(Canvas canvas) {

        // TODO:   Your code goes here

    }

    /**
     * Returns the current Shape type as a ShapeType.
     *
     * @return ShapeType.RECTANGLE
     */
    public ShapeType getShapeType(){ return ShapeType.RECTANGLE; }


}
