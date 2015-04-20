package sg.edu.nus.cs3218tut;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View.OnClickListener;


public class MainActivity extends Activity implements OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.bgimage);
        image.setImageResource(R.drawable.bg);
        image.setScaleType(ImageView.ScaleType.FIT_XY);


        final GestureDetector gdt = new GestureDetector(new GestureListener());
        final ImageView imageView  = (ImageView) findViewById(R.id.bgimage);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(final View view, final MotionEvent event) {
                gdt.onTouchEvent(event);
                return true;
            }
        });

    }

    public void onClick(View v) {

    }

//SwipeGestureDetector
    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private static final int SWIPE_MIN_DISTANCE = 50;
        private static final int SWIPE_THRESHOLD_VELOCITY = 100;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
                               float velocityY) {
            try {

                float diff = e1.getX() - e2.getX();
                float diff2 = e1.getY() - e2.getY();


                if (diff2 > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                    MainActivity.this.Swipe();
                }

                if (diff2 > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityY) > SWIPE_THRESHOLD_VELOCITY) {
                    MainActivity.this.Swipe();
                }

                // Left swipe
                if (diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    MainActivity.this.Swipe();
                }
                // Right swipe
                else if (-diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    MainActivity.this.Swipe();
                }
            } catch (Exception e) {
                Log.e("Home", "Error on gestures");
            }
            return false;
        }

    }

    private void Swipe() {

        Intent myIntent = new Intent(this,Tut1.class);
        startActivity(myIntent);
    }



}
