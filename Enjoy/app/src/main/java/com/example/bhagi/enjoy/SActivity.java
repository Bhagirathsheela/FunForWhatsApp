package com.example.bhagi.enjoy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SActivity extends AppCompatActivity {

    Button btn;
    TextView txtView;
    public static String[] story = {"sayri1", "syari2"};

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jocks);
        int title = getIntent().getIntExtra("title_id", 0);
        txtView = (TextView) findViewById(R.id.textview);
        txtView.setMovementMethod(new ScrollingMovementMethod());
        txtView.setText(story[title]);

        btn=(Button)findViewById(R.id.share);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int title = getIntent().getIntExtra("title_id", 0);
                txtView = (TextView) findViewById(R.id.textview);

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, story[title]+".\n"+"#bhagi");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });


    }
}
