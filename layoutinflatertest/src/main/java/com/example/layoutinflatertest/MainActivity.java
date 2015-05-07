package com.example.layoutinflatertest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {
    LayoutInflater layoutInflater1;
    LayoutInflater layoutInflater2;
    LayoutInflater layoutInflater3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutInflater1=LayoutInflater.from(MainActivity.this);
        layoutInflater2=getLayoutInflater();
        layoutInflater3=(LayoutInflater)MainActivity.this.getSystemService(LAYOUT_INFLATER_SERVICE);
        if (layoutInflater1.equals(layoutInflater2))
        {
            Log.d("hehehhe","l1=l2");
        }
        else
        {
            Log.d("hehehhe","l1!=l2");
        }
        if (layoutInflater3.equals(layoutInflater2))
        {
            Log.d("hehehhe","l3=l2");
        }
        else
        {
            Log.d("hehehhe","l3!=l2");
        }if (layoutInflater1.equals(layoutInflater3))
        {
            Log.d("hehehhe","l1=l3");
        }
        else
        {
            Log.d("hehehhe","l1!=l3");
        }
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twoButton();
            }
        });
    }
    public void twoButton(){
        layoutInflater1.inflate(R.layout.test,null);
        View layout=layoutInflater1.inflate(R.layout.test,null);
        Button button1=(Button)layout.findViewById(R.id.button_1);
        Button button2=(Button)layout.findViewById(R.id.button_2);
        button1.setText("haha");
        button2.setText("hehe");
        MainActivity.this.setContentView(layout);
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
