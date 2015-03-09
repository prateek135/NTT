package com.example.its_pky.coversongs;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by its_PKY on 3/5/2015.
 */
class CustomAdapter extends ArrayAdapter<String>{
    CustomAdapter(Context context, String[] ss) {
        super(context,R.layout.row_layout, ss);

    }
int i=0;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li=LayoutInflater.from(getContext());
        View view= li.inflate(R.layout.row_layout, parent, false);
        String sst=getItem(position);

        TextView tv=(TextView)view.findViewById(R.id.textView5);


                Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(),"font1.ttf");
        tv.setTypeface(custom_font);
ImageView iv=(ImageView)view.findViewById(R.id.imageView);
        tv.setText(sst);
        iv.setImageResource(R.drawable.ic_launcher);

    switch (i)
    {
        case 0:
            iv.setImageResource(R.drawable.sid);
            break;
        case 1:
            iv.setImageResource(R.drawable.shirl);
            break;

        case 2:
            iv.setImageResource(R.drawable.jonita);break;
        default:
            iv.setImageResource(R.drawable.ic_launcher);break;
    }
i++;

return view;
    }
}
