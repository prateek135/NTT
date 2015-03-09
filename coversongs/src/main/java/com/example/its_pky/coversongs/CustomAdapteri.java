package com.example.its_pky.coversongs;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by its_PKY on 3/5/2015.
 */
class CustomAdapteri extends ArrayAdapter<String>{
    CustomAdapteri(Context context, String[] ss) {
        super(context,R.layout.inside_row, ss);

    }
int i=0;
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater li=LayoutInflater.from(getContext());
        View view= li.inflate(R.layout.inside_row, parent, false);
        String sst=getItem(position);

        TextView tv=(TextView)view.findViewById(R.id.textViewi);


                Typeface custom_font = Typeface.createFromAsset(getContext().getAssets(),"font1.ttf");
        tv.setTypeface(custom_font);
        tv.setText(sst);

return view;
    }
}
