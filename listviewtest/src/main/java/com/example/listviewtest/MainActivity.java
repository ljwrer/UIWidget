package com.example.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    private List<SoccerPlayer>soccerPlayerList=new ArrayList<SoccerPlayer>();
//    private  String []data={"Mohamed Salah",
//            "Ruben Loftus-CheekAndreas Christensen",
//            "César Azpilicueta",
//            "John Terry",
//            "Gary Cahill",
//            "Juan Cuadrado",
//            "Willian",
//            "Nemanja Matic",
//            "Diego Costa",
//            "Loïc Remy",
//            "André Schürrle",
//            "Thibaut Courtois",
//            "John Obi Mikel",
//            "Didier Drogba",
//            "Eden Hazard",
//            "Oscar",
//            "Ramires",
//            "Nathan Aké",
//            "Kurt Zouma",
//            "Cesc Fàbregas",
//            "Filipe Luis",
//            "Branislav Ivanovic",
//            ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initSoccerPlayer();
        ListView listView=(ListView)findViewById(R.id.list_view);
        SoccerAdapter soccerAdapter=new SoccerAdapter(MainActivity.this,R.layout.soccer_person,soccerPlayerList);
        listView.setAdapter(soccerAdapter);

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
    public  void initSoccerPlayer(){
        SoccerPlayer PetrCech=new SoccerPlayer("Petr Cech",R.drawable.petrcech);
        SoccerPlayer andreaschristensen=new SoccerPlayer("andreaschristensen",R.drawable.andreaschristensen);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(andreaschristensen);

        soccerPlayerList.add(PetrCech);

        soccerPlayerList.add(andreaschristensen);soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(andreaschristensen);
        soccerPlayerList.add(andreaschristensen);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);
        soccerPlayerList.add(PetrCech);


    }
}
