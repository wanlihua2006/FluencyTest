package com.qiku.fluencytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {
    private final int ListNum = 2000;
    private String [] item = new String[ListNum];
    private ListView list_item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < ListNum; i++) {
            item[i] = "list item: " + i;
        }

        //System.out.println(Arrays.toString(item));
        list_item = findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item );
        list_item.setAdapter(adapter);
    }
}
