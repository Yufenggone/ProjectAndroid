package com.example.shane_000.keyboardshortcuts;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shane_000 on 2015/7/11.
 */

public class ActivityLearn extends ListActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_learn);
        List<String> data = new ArrayList<String>();
        data.add("Copy: Ctrl+ C");
        data.add("Paste: Ctrl+ V");
        data.add("Cut: Ctrl+ X");
        data.add("Shift between programs: Alt + Tab");
        data.add("Search for a string: Ctrl + F");
        setListAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, data));
        Button btn_return = (Button) findViewById(R.id.button_return);
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}