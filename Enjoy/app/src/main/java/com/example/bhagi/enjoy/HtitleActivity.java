package com.example.bhagi.enjoy;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.bhagi.enjoy.R.id.listView;

public class HtitleActivity extends AppCompatActivity {
    ListView lv;
    Context context;

    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.mohan,R.drawable.ashoka,R.drawable.maharana,R.drawable.bajirav,R.drawable.hist1,R.drawable.orang,R.drawable.hist1,R.drawable.hist1};
    public static String [] prgmNameList={"मोहन जोदड़ो का इतिहास","सम्राट अशोक का गौरवपूर्ण इतिहास","महाराणा प्रताप का इतिहास","बाजीराव मस्तानी की रोमांचक स्टोरी","बाबर का इतिहास","औरंगज़ेब की जीवनी","ताजमहल का इतिहास","जलाल उद्दीन मोहम्मद अकबर जीवनी "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtitle);
        context=this;

        lv=(ListView) findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(this,prgmNameList,prgmImages,3));
        //getIntent().getIntExtra("egsgsg",0);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
