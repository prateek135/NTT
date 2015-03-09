package com.example.its_pky.coversongs;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class SidSlathia extends ActionBarActivity {
    String sid[]={"Cover1","Cover 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final String ss[]={"Tu hi re","Abhi mujh me kahin","Samjhawan","Soniye Heeriye","Bacche ki Maa","Gulabi Ankhein","Muskurane Ki Wajah","Meharbaani","Naam e Wafa"};
        final String vidlinks[]={"https://www.youtube.com/watch?v=QaW0wUit5o8","https://www.youtube.com/watch?v=Fs1d01J96mA","https://www.youtube.com/watch?v=-_sYNKFVFj8","https://www.youtube.com/watch?v=_3SVztFB5_Q","https://www.youtube.com/watch?v=R3N300KukQY","https://www.youtube.com/watch?v=4safaMmvYiU","https://www.youtube.com/watch?v=buR7BOHRNPM","https://www.youtube.com/watch?v=wjz4_foaKQI","https://www.youtube.com/watch?v=DCpxdsNLyeI","https://www.youtube.com/watch?v=6Qv2UHtGYlY","https://www.youtube.com/watch?v=fBP-Q-Nq3UM"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sid_slathia);
        ListAdapter adapter2=new CustomAdapteri(this,ss);

        ListView lv=(ListView)findViewById(R.id.listView2);
        lv.setAdapter(adapter2);




        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               for (int i = 0; i < vidlinks.length; i++) {

                if (position == i) {
                    Intent ii = new Intent(Intent.ACTION_VIEW, Uri.parse(vidlinks[i]));
                    startActivity(ii);
                }
            }
            }
        });

        lv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
               // Toast.makeText(getApplicationContext(),"H "+scrollState,Toast.LENGTH_SHORT).show();
             //   view.setSmoothScrollbarEnabled(true);
                android.support.v7.app.ActionBar bar=getSupportActionBar();

                bar.hide();


            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                Toast.makeText(getApplicationContext(),""+firstVisibleItem+"    "+visibleItemCount+"    "+totalItemCount,Toast.LENGTH_SHORT);

            }
        });

        //Typeface custom_font = Typeface.createFromAsset(getAssets(),
        //      "src/main/assests/font1.ttf");


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sid_slathia, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

