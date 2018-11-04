package com.example.sarai.projectcem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Generate Graph button */
    public void generateGraph(View view) {
        Intent intent = new Intent(this, DisplayGraphActivity.class);
        startActivity(intent);
    }

    public void calculateParameters(View view) {
        // Do something in response to button
    }
}
