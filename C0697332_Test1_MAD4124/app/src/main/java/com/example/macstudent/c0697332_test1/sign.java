package com.example.macstudent.c0697332_test1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

/**
 * Created by macstudent on 2017-08-04.
 */

public class sign extends AppCompatActivity {
    EditText edt1, edt2;
    Button btn2;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edt1= (EditText) findViewById(R.id.uname);
        edt2= (EditText) findViewById(R.id.pword);
        btn2= (Button) findViewById(R.id.signup);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm.init(getApplicationContext());
                realm=Realm.getDefaultInstance();
                UserData obj=new UserData();
                obj.username=edt1.getText().toString();
                obj.password=edt2.getText().toString();
                realm.beginTransaction();
                realm.copyToRealm(obj);
                realm.commitTransaction();
                Toast.makeText(sign.this, "Saved To Realm", Toast.LENGTH_SHORT).show();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(getApplicationContext(),ShowDetails.class);
                startActivity(myIntent);
            }
        });

    }

}

