package com.example.macstudent.c0697332_test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by macstudent on 2017-08-04.
 */

class ShowDetails extends AppCompatActivity {

    Realm realm;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        lv= (ListView) findViewById(R.id.listView);
        Realm.init(this);
        realm=Realm.getDefaultInstance();
        RealmResults<UserData> test = realm.where(UserData.class).findAll();
        String[] names=new String[test.size()];
        String[] pass=new String[test.size()];
        for(int i=0;i<test.size();i++)
        {
            names[i]=test.get(i).username;
            pass[i]=test.get(i).password;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, names);
        lv.setAdapter(adapter);
    }
}
