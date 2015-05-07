package com.example.soceerlistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends Activity {
    public  static ArrayList<Soccer>arrayList=new ArrayList<Soccer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.list_view);
        initSoccer();
        SoccerAdapter soccerAdapter=new SoccerAdapter(MainActivity.this,R.layout.soccer_player,arrayList);
        listView.setAdapter(soccerAdapter);
    }
    public void initSoccer(){
        Soccer petrCech=new Soccer(1,R.drawable.petrcech,"petrCech");
        Soccer branislavIvanovic=new Soccer(2,R.drawable.branislavivanovic,"branislavIvanovic");
        Soccer filipeLuis=new Soccer(3,R.drawable.filipeluis,"filipeLuis");
        Soccer cescFabregas=new Soccer(4,R.drawable.cescfabregas,"cescFabregas");
        Soccer kurtZouma=new Soccer(5,R.drawable.kurtzouma,"kurtZouma");
        Soccer johnMikelObi=new Soccer(6,R.drawable.johnmikelobi,"johnMikelObi");
        Soccer ramires=new Soccer(7,R.drawable.ramires,"ramires");
        Soccer oscar=new Soccer(8,R.drawable.oscar,"oscar");
        Soccer edenHazard=new Soccer(10,R.drawable.edenhazard,"edenHazard");
        Soccer didierDrogba= new Soccer(11,R.drawable.didierdrogba,"didierDrogba");
        Soccer johnTerry=new Soccer(26,R.drawable.johnterry,"johnTerry");
        Soccer cesarAzpilicueta=new Soccer(28,R.drawable.cesarazpilicueta,"cesarAzpilicueta");
        arrayList.add(petrCech);
        arrayList.add(branislavIvanovic);
        arrayList.add(filipeLuis);
        arrayList.add(cescFabregas);
        arrayList.add(kurtZouma);
        arrayList.add(johnMikelObi);
        arrayList.add(ramires);
        arrayList.add(oscar);
        arrayList.add(edenHazard);
        arrayList.add(didierDrogba);
        arrayList.add(johnTerry);
        arrayList.add(cesarAzpilicueta);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
