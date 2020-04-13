package com.example.bhagi.enjoy;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import static com.example.bhagi.enjoy.R.id.buckysListView;

public class IntrstActivity extends AppCompatActivity {

        /*//interesting facts list
        String[] intrst ={
            "सपने में देखने वाले हर चेहरे से हम एक बार जरूर मिले होते हैं.", "Guinness Book of World Records में दर्ज नामों में भारतीयों की संख्या तीसरे नंबर पर हैं."," पहली बार चीनी भारत में ही बनाई गई थी.","दुनिया का सबसे पहला कंप्यूटर माउस 1964 में बनाया गया था. वो भी लकड़ी से.","गर्म रंग जैसे पीला, केसरिया और लाल भूख बढ़ाते हैं. यही वजह है कि कुछ रेस्टोरेंट पीला, केसरिया और लाल रंग से पेंट किए जाते हैं."," स्पर्म में पाए जाने वाले प्रोटीन को महिलाओंं की त्वचा के लिए काफी अच्छा बताया जाता हैं.","पहले साल में कोका-कोला की कुल 25 बॉटल ही बिकी थीं। यह एक अच्छा उदाहरण है कि असफलता मिलने पर काम को बंद नहीं करना चाहिए.","जब आप झूठ बोलते है आपकी नाक गर्म हो जाती है.","पादने से शरीर का ब्लड प्रेशर कंट्रोल में रहता हैं","Youtube पर सबसे ज्यादा सर्च की जाने वाली चीज हैं How To Kiss.","यौन क्रिया के दौरान महिलाओं के मुकाबले पुरुषों को कहीं ज्यादा पसीना आता है। स्त्रियां की शारीरिक संरचना में बदन से निकलने वाले पानी को नियंत्रित करने की क्षमता होती है।"," एक स्वस्थ मनुष्य संभोग के दौरान करीब पांच मिलीलीटर वीर्य स्खलित करता है, जिसमें तीस करोड़ से पचास करोड़ तक शुक्राणु मौजूद होते हैं।","धरती के गुरूत्वाकर्षण के कारण पर्वतों का 15,000 मीटर से ऊँचा होना संभव नही है."," 269 मीटर की ऊँचाई वाले टाइटैनिक को अगर सीधा खड़ा कर दिया जाए तो यह अपने समय की हर इमारत से ऊँचा होता .","टाइटैनिक की चिमनिया इतनी बड़ी थी कि इनमें से दो ट्रेने गुजर सकती थी."
        };
        ListAdapter intrstAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, intrst);
        ListView intrstListView = (ListView) findViewById(R.id.IntrstListView);
        intrstListView.setAdapter(intrstAdapter);*/

    Button btn;
    TextView txtView;
    public static String[] story = {"int1", "int22"};

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intrst);
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
