package rs.f16csc413p2;

import android.util.Log;

import static junit.framework.Assert.assertEquals;
import android.content.Context;
import android.test.AndroidTestCase;

public class TestShapes extends AndroidTestCase {

    Context mContext;

    public void setUp() throws Exception{
        super.setUp();
        mContext = getContext();
        assertNotNull(mContext);
    }


    public void testCircle() {
        Log.d(Test.TAG, "Testing Circle...");
        Shape circle = new Circle(mContext);
        circle.setShapeAlpha(42.0f);
        assertEquals(circle.getShapeAlpha(), 42.0f);
    }

    public void testRectangle() {
        Log.d(Test.TAG, "Testing Rectangle...");
        Shape rectangle = new Rectangle(mContext);
        rectangle.setShapeAlpha(42.0f);
        assertEquals(rectangle.getShapeAlpha(), 42.0f);
    }

    public void testPicture() {
        Log.d(Test.TAG, "Testing Picture...");
        Shape picture = new Picture(mContext);
        picture.setShapeAlpha(42.0f);
        assertEquals(picture.getShapeAlpha(), 42.0f);
    }


}
