package com.example.its_pky.coversongs;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Shirl extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String ss[]={"HangOver","Tu hai ki Nahi","Bas Bajna Chaahiye Gaana","Meri Aashiqui Ab Tum hi ho","Yaaram"};
        final String vidlinks[]={"https://www.youtube.com/watch?v=QaW0wUit5o8","https://www.youtube.com/watch?v=Fs1d01J96mA","https://www.youtube.com/watch?v=-_sYNKFVFj8"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shirl);
        ListAdapter adapter2=new CustomAdapter(this,ss);

        ListView lv=(ListView)findViewById(R.id.listViews);
        lv.setAdapter(adapter2);

        //Typeface custom_font = Typeface.createFromAsset(getAssets(),
        //      "src/main/assests/font1.ttf");

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "HOWWWWWWWWWWWWW", Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_shirl, menu);
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
