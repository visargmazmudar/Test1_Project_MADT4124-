package com.example.macstudent.c0697332_test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    Button btn1,btn2;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1= (EditText) findViewById(R.id.username);
        edt2= (EditText) findViewById(R.id.password);
        btn1= (Button) findViewById(R.id.Login);
        btn2= (Button) findViewById(R.id.signup);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity.this,sign.class);
                startActivity(myIntent);
            }
        });
    }
}