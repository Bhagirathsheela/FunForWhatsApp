package com.example.bhagi.enjoy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.view.View;
import android.widget.Toast;

import static com.example.bhagi.enjoy.R.id.hindi_jocks;
import static com.example.bhagi.enjoy.R.id.history;
import static com.example.bhagi.enjoy.R.id.intrst_fact;

public class OptionActivity extends AppCompatActivity {
    Button hindi_jocks;
    Button btn;
    Button motivation,history;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);


        //goto hindi jocks
        hindi_jocks = (Button)findViewById(R.id.hindi_jocks);
        hindi_jocks.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, JtitleActivity.class);
                startActivity(i);
            }
        });

        //goto interesting facts
        btn=(Button)findViewById(R.id.intrst_fact);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, ItitleActivity.class);
                startActivity(i);

            }
        });

        //go to motivation
        motivation=(Button)findViewById(R.id.motivation);
        motivation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, MtitleActivity.class);
                startActivity(i);

            }
        });
         // go to history
        btn=(Button)findViewById(R.id.history);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, HtitleActivity.class);
                startActivity(i);

            }
        });
        //go to knowledge
        motivation=(Button)findViewById(R.id.knowledge);
        motivation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, KtitleActivity.class);
                startActivity(i);

            }
        });
        //go to syayri
        motivation=(Button)findViewById(R.id.sayari);
        motivation.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OptionActivity.this, StitleActivity.class);
                startActivity(i);

            }
        });

    }
}
