package rs.f16csc413p2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import java.util.Random;


/**
 *  Concrete instance of the Shape class as a picture.  Implements onDraw(Canvas).
 *
 *  See Circle for implementation details.
 */
public class Picture extends Shape {

    /**
     * Constructor
     *
     * @param context Current application context.
     */
    public Picture(Context context){
        super(context);
    }


    /**
     * Called when canvas is redrawn.  Draws a bitmap onto the canvas.
     *
     * @param canvas the canvas onto which the bitmap will be drawn
     *
     */
    public void onDraw(Canvas canvas) {
        // TODO:   Your code goes here

        /*
        * you need to figure out how to use BitmapFactory to decode the
        * resource of the drawable sfsu_logo into img which is then
        * sent to the canvas to be drawn as a bitmap.
        */
        // TODO:   Your code goes here
        Bitmap img = BitmapFactory.decodeResource(getResources(), R.drawable.sfsu_logo);
        canvas.drawBitmap(img, ulx, uly, paint);
    }

    /**
     * Returns the current Shape type as a ShapeType.
     *
     * @return ShapeType.PICTURE
     */
    public ShapeType getShapeType(){ return ShapeType.PICTURE; }

}
