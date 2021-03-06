package com.example.bhagi.enjoy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import static java.security.AccessController.getContext;

/**
 * Created by Bhagi on 27/9/2016.
 */

public class CustomAdapter extends BaseAdapter {
    String [] result;
    Context context;
    int [] imageId;
    int activity;
    private static LayoutInflater inflater=null;
    public CustomAdapter(AppCompatActivity Activity, String[] prgmNameList, int[] prgmImages, int mActivity) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        context=Activity;
        imageId=prgmImages;
        activity = mActivity;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.activity_mtitlechild, null);
        holder.tv=(TextView) rowView.findViewById(R.id.textView1);
        holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result[position]);
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
               // Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();
                Intent intent=null;
                switch(activity) {
                    case 0:
                        intent = new Intent(context, JocksActivity.class);
                        break;
                    case 1:
                        intent = new Intent(context, IntrstActivity.class);
                        break;
                    case 2:
                        intent = new Intent(context, MotivationActivity.class);
                        break;
                    case 3:
                        intent = new Intent(context, HistoryActivity.class);
                        break;
                    case 4:
                        intent = new Intent(context, KActivity.class);
                        break;
                    case 5:
                        intent = new Intent(context, SActivity.class);
                        break;
                }
                intent.putExtra("title_id",position);
                context.startActivity(intent);

            }

        });
        return rowView;
    }

}