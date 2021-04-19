package com.example.screen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Double.valueOf;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textview;
    float value = 0;
    DisplayMetrics displaymetrics;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnShowDensity);
        textview = findViewById(R.id.textView);
        activity = MainActivity.this;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaymetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);

                value = getResources().getDisplayMetrics().density;
                textview.setText("Screen Density=" + valueOf(value));
            }
        });

    }
}
