package sg.edu.nus.cs3218tut;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.app.Activity;


public class Tut1 extends Activity {
    private float result;
    private String currentOperator;
    private String currentTri;

    private TextView calculatorDisplay;
    private float currentNumber;
    private boolean decimalPressed;
    private int decimalPlace;
    private int maxDecimalPlaces = 6;
    @SuppressLint("NewApi")



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tut1);

    }


    Intent myIntent;
    public void goToMainActivity(View view){
        finish();
    }


}
