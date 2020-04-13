package com.example.bhagi.enjoy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class StitleActivity extends AppCompatActivity {
    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.share,R.drawable.share};
    public static String [] prgmNameList={"s1","s2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtitle);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this,prgmNameList,prgmImages,5));
        //getIntent().getIntExtra("egsgsg",0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
