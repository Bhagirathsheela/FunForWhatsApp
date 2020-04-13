package com.example.bhagi.enjoy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.bhagi.enjoy.R.id.listView;

public class MtitleActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.moti2,R.drawable.moti1,R.drawable.moti2};
    public static String [] prgmNameList={"बदलाव","आखिर हम क्यों नहीं बदलते","खम्भे ने पकड़ रखा है! "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtitle);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this,prgmNameList,prgmImages,2));
        //getIntent().getIntExtra("egsgsg",0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
