package com.study.listviewtest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by WXB506 on 2016/2/24.
 */
public class MainActivity extends ActionBarActivity {

    private String[] data = { "Apple", "Banana", "Orange", "Watermelon", "Pear",
                              "Grape", "Pineapple", "Strawberry", "Cherry", "Mango",
                              "Apple", "Banana", "Orange", "Watermelon", "Pear",
                              "Grape", "Pineapple", "Strawberry", "Cherry", "Mango" };

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
