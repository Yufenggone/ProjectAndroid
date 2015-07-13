package com.example.shane_000.keyboardshortcuts;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {
    Button button_test, button_learn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_test = (Button) findViewById(R.id.button_test);
        button_learn = (Button) findViewById(R.id.button_learn);

        button_learn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MainActivity.this, ActivityLearn.class));
            }
        });

        button_test.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(MainActivity.this, ActivityTest.class));
            }
        });
    }
}
