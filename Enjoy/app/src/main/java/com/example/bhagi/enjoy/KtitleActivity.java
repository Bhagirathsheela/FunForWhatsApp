package com.example.bhagi.enjoy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

public class KtitleActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.mohan,R.drawable.ashoka};
    public static String [] prgmNameList={"yeah yeah 1","yo yo 2"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtitle);
        context=this;
///this mtitle can be used for all so that no need to create title for all
        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this,prgmNameList,prgmImages,4));
        //getIntent().getIntExtra("egsgsg",0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
