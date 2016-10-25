package rs.f16csc413p2;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;

public class TestShapeFactory extends AndroidTestCase {
    Context mContext;

    public void setUp() throws Exception{
        super.setUp();
        mContext = getContext();
        assertNotNull(mContext);
    }

    public void testShapeFactoryBadString() {
     Log.d(Test.TAG, "Testing ShapeFactory bad string decoding...");

     ShapeFactory mShapeFactory = new ShapeFactory();
     assertNull(mShapeFactory.getShape(mContext,"blah"));
    }

    public void testShapeFactoryStringDecoding(){
        Log.d(Test.TAG, "Testing ShapeFactory good string decoding...");

        ShapeFactory mShapeFactory = new ShapeFactory();

        Circle mCircle1 = (Circle)mShapeFactory.getShape(mContext,"Circle");
        Circle mCircle2 = (Circle)mShapeFactory.getShape(mContext,"circle");
        Circle mCircle3 = (Circle)mShapeFactory.getShape(mContext,"CIRCLE");
        assertEquals(ShapeType.CIRCLE, mCircle1.getShapeType());
        assertEquals(ShapeType.CIRCLE, mCircle2.getShapeType());
        assertEquals(ShapeType.CIRCLE, mCircle3.getShapeType());

        Rectangle mRect1 = (Rectangle)mShapeFactory.getShape(mContext,"Rectangle");
        Rectangle mRect2 = (Rectangle)mShapeFactory.getShape(mContext,"rectangle");
        Rectangle mRect3 = (Rectangle)mShapeFactory.getShape(mContext,"RECTANGLE");
        assertEquals(ShapeType.RECTANGLE, mRect1.getShapeType());
        assertEquals(ShapeType.RECTANGLE, mRect2.getShapeType());
        assertEquals(ShapeType.RECTANGLE, mRect3.getShapeType());

        Picture mPicture1 = (Picture)mShapeFactory.getShape(mContext,"Picture");
        Picture mPicture2 = (Picture)mShapeFactory.getShape(mContext,"picture");
        Picture mPicture3 = (Picture)mShapeFactory.getShape(mContext,"PICTURE");
        assertEquals(ShapeType.PICTURE, mPicture1.getShapeType());
        assertEquals(ShapeType.PICTURE, mPicture2.getShapeType());
        assertEquals(ShapeType.PICTURE, mPicture3.getShapeType());
    }


    public void testShapeFactoryObjectReturns(){
        Log.d(Test.TAG, "Testing ShapeFactory object returns...");

        ShapeFactory mShapeFactory = new ShapeFactory();

        assertEquals(ShapeType.CIRCLE,
                ((Circle)mShapeFactory.getShape(mContext,"Circle")).
                        getShapeType());

        assertEquals(ShapeType.RECTANGLE,
                ((Rectangle)mShapeFactory.getShape(mContext,"Rectangle")).
                        getShapeType());

        assertEquals(ShapeType.PICTURE,
                ((Picture)mShapeFactory.getShape(mContext,"Picture")).
                        getShapeType());

    }



}
