package rs.f16csc413p2;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    List<Shape> shapesList = new ArrayList<Shape>(); /** List holds Shapes in view */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // SETUP

        // Hides action bar
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null)
            actionBar.hide();

        // link to resources
        Button buttonRect = (Button)findViewById(R.id.buttonRect);
        Button buttonCirc = (Button)findViewById(R.id.buttonCirc);
        Button buttonClear = (Button)findViewById(R.id.buttonClear);

        final RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.container);
        TextView msg = (TextView)findViewById(R.id.textView);

        // creates shapes
        final ShapeFactory shapeFactory = new ShapeFactory();


        // FUNCTIONAL

        /**
         * Clicking on the shape count will cause random rectangle to be drawn
         */
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addShape(ShapeType.RECTANGLE, v);
            }
        });

        /**
         * Long clicking on clear button will exit program
         */
        buttonClear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
                return true;
            }
        });


        /**
         * Long clicking on the canvas will clear the canvas
         */
        relativeLayout.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                clearCanvas();
                return true;
            }
        });


        /**
         * Clicking on the canvas will draw a picture.  Picture have been pre-loaded in
         * resources.
         */
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Your code goes here
            }
        });


        /**
         * Clicking on the RECT button will add a rectangle to canvas
         */
        buttonRect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO:  Your code goes here
            }
        });

        /**
         * Clicking on the CIRC button will add a rectangle to canvas
         */
        buttonCirc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO:  Your code goes here
            }
        });

        /**
         * Clicking on the CLEAR button will clear the canvas
         */
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: Your code goes here
            }
        });

    }

    // SUPPORT METHODS

    /**
     * Adjusts adjusts alpha for all shapes in list.
     *
     * Decrements every alpha value by 0.1f.  If alpha is less than
     * zero, removes shape from list.  See Shape.java to figure out
     * how to get and set the shape's alpha.
     *
     * @return ListIterator<Shape> the iterator for the shapesList
     */
    public ListIterator<Shape> adjustShapesAlpha(){

        ListIterator<Shape> it = shapesList.listIterator();

        float alpha = 0.0f;

        // TODO:  Your code goes here

        return it;
    }


    /**
     *  Updates the shapes count text bar with current count of shapes
     *  on screen.
     */
    public void updateShapesCount(){
        int rectangles = 0;
        int circles = 0;
        int pictures = 0;

        Iterator<Shape> it = shapesList.iterator();

        while(it.hasNext()){
            switch(it.next().getShapeType()) {
                case CIRCLE:
                    circles++;
                    break;
                case RECTANGLE:
                    rectangles++;
                    break;
                case PICTURE:
                    pictures++;
                    break;
                default:
                    break;
            }
        }

        TextView msg = (TextView)findViewById(R.id.textView);
        msg.setText(String.format("%d R, %d C, %d P",rectangles,circles, pictures));
    }


    /**
     * Adds a Shape to the view.
     *
     * First, the specified shape is added to the shape list.  Then,
     * the alpha is updated for all shapes.  Then the shape is added to the
     * view.  Finally the shape count bar at the top of the screen is updated.
     *
     * @param shapeType type of shape to add
     * @param v         view to add shape to
     */
    public void addShape(ShapeType shapeType, View v){
        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.container);

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape newShape = null;

        switch(shapeType){

            // TODO:  Your code goes here

        }
        shapesList.add(newShape);

        adjustShapesAlpha();
        relativeLayout.addView(newShape);
        updateShapesCount();
    }

    /**
     * Clears canvas by removing the view, then updates the on-screen shape count
     */
    private void clearCanvas(){
        RelativeLayout relativeLayout=(RelativeLayout) findViewById(R.id.container);
        relativeLayout.removeAllViews();
        shapesList.clear();
        updateShapesCount();
    }
}
