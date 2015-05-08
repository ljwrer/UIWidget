package com.example.uibestpractice;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    List<TalkBox> arrayList=new ArrayList<TalkBox>();
    ListView listView;
    Button button;
    EditText editText;
    TalkBoxAdapter talkBoxAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMessage();
        talkBoxAdapter=new TalkBoxAdapter(MainActivity.this,R.layout.listview_item,arrayList);
        listView=(ListView)findViewById(R.id.list_view);
        listView.setAdapter(talkBoxAdapter);
        button=(Button)findViewById(R.id.send);
        editText=(EditText)findViewById(R.id.message);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text=editText.getText().toString();
                Log.d("dddd",text);
                if (!"".equals(text))
                {
                    TalkBox m=new TalkBox(text,TalkBox.SEND_MESSAGE);
                    Log.d("dddd",m.getMessage());
                    arrayList.add(m);
                    talkBoxAdapter.notifyDataSetChanged();
                    listView.setSelection(arrayList.size());
                    editText.setText("");
                }
            }
        });
    }
    public void initMessage(){
        TalkBox m1=new TalkBox("hello",TalkBox.RECEIVE_MESSAGE);
        TalkBox m2=new TalkBox("hi",TalkBox.SEND_MESSAGE);
        TalkBox m3=new TalkBox("how's it going?",TalkBox.RECEIVE_MESSAGE);
        arrayList.add(m1);
        arrayList.add(m2);
        arrayList.add(m3);
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
