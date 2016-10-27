package rs.f16csc413p2;

import android.content.Context;
import android.widget.Switch;

/**
 * Returns either a circle, rectangle or picture shape that can
 * be sent to a view since each shape implements the onDraw() method.
 * Returns null if the string cannot be decoded
 *
 * @param   context     Current application context
 * @param   shape       String containing either circle, rectangle or picture
 * @return              Shape object or null if the shape string cannot be decoded
 */
public class ShapeFactory {

    public Shape getShape(Context context, String shape) {

        // TODO: Your code goes here
        switch (shape.toUpperCase()) {
            case "RECTANGLE":
                return new Rectangle(context);
            case "CIRCLE":
                return new Circle(context);
            case "PICTURE" :
                return new Picture(context);
            default:
                return null;
        }
    }
}
