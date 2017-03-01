package com.darkflamemaster.thenewboston;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by Dark Flame Master on 2/5/2017.
 */

public class TextPlay extends Activity implements View.OnClickListener {

    ToggleButton passTog;
    EditText input;
    TextView display;
    Button chkCmd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        baconAndEgg();
        passTog.setOnClickListener(this);
        chkCmd.setOnClickListener(this);
    }

    private void baconAndEgg() {
        chkCmd = (Button) findViewById(R.id.btnResult);
        passTog = (ToggleButton) findViewById(R.id.tbPassword);
        input = (EditText) findViewById(R.id.edtCommand);
        display = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnResult:
                String check = input.getText().toString();
                display.setText(check);
                if(check.contentEquals("left")){
                    display.setGravity(Gravity.LEFT);
                    display.setTextColor(Color.WHITE);
                }else if(check.contentEquals("center")){
                    display.setGravity(Gravity.CENTER);
                    display.setTextColor(Color.WHITE);
                }else if(check.contentEquals("right")){
                    display.setGravity(Gravity.RIGHT);
                    display.setTextColor(Color.WHITE);
                }else if(check.contentEquals("blue")){
                    display.setTextColor(Color.BLUE);
                }else if(check.contains("WTF")){
                    Random crazy = new Random();
                    display.setText("WTF !!!!");
                    display.setTextSize(crazy.nextInt(75));
                    display.setTextColor(Color.rgb(crazy.nextInt(265),crazy.nextInt(265),crazy.nextInt(265)));
                    switch (crazy.nextInt(3)){
                        case 0:
                            display.setGravity(Gravity.LEFT);break;
                        case 1:
                            display.setGravity(Gravity.CENTER);break;
                        case 2:
                            display.setGravity(Gravity.RIGHT);break;
                    }
                }else {
                    display.setGravity(Gravity.CENTER);
                    display.setText("invalid");
                    display.setTextColor(Color.WHITE);
                }
                break;
            case R.id.tbPassword:
                if (passTog.isChecked()){
                    input.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }else{
                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                }
                break;
        }
    }
}
