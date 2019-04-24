package com.xl.xitcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle b = getIntent().getExtras();

//        String username = getIntent().getStringExtra("USERNAME");
        String username = b.getString("USERNAME");
        String password = b.getString("PASSWORD");

        txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Username Anda: "+username+" dan Password: "+password);
    }

}
