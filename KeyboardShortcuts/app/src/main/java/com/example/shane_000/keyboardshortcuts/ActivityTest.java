package com.example.shane_000.keyboardshortcuts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by shane_000 on 2015/7/12.
 */
public class ActivityTest extends ActionBarActivity{
    EditText edittext_copy, edittext_paste, edittext_cut, edittext_shift,edittext_search;
    TextView textview_copy,textview_paste,textview_cut,textview_shift,textview_search;
    Button btn_check,btn_return;
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_test);
        edittext_copy = (EditText) findViewById(R.id.edit_copy);
        edittext_paste = (EditText) findViewById(R.id.edit_paste);
        edittext_cut = (EditText) findViewById(R.id.edit_cut);
        edittext_shift = (EditText) findViewById(R.id.edit_shift);
        edittext_search = (EditText) findViewById(R.id.edit_search);
        textview_copy=(TextView) findViewById(R.id.textView_feedback1);
        textview_paste=(TextView) findViewById(R.id.textView_feedback2);
        textview_cut=(TextView) findViewById(R.id.textView_feedback3);
        textview_shift=(TextView) findViewById(R.id.textView_feedback4);
        textview_search=(TextView) findViewById(R.id.textView_feedback5);
        btn_check = (Button) findViewById(R.id.button_check);
        btn_return = (Button) findViewById(R.id.button_return);
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (!edittext_copy.getText().toString().equals("A")) {
                    textview_copy.setText("Wrong!");
                } else {
                    textview_copy.setText("Correct!");
                }
                if (!edittext_paste.getText().toString().equals("B")) {
                    textview_paste.setText("Wrong!");
                } else {
                    textview_paste.setText("Correct!");
                }
                if (!edittext_cut.getText().toString().equals("C")) {
                    textview_cut.setText("Wrong!");
                } else {
                    textview_cut.setText("Correct!");
                }
                if (!edittext_shift.getText().toString().equals("D")) {
                    textview_shift.setText("Wrong!");
                } else {
                    textview_shift.setText("Correct!");
                }
                if (!edittext_search.getText().toString().equals("E")) {
                    textview_search.setText("Wrong!");
                } else {
                    textview_search.setText("Correct!");
                }
            }
        });
    }
}
