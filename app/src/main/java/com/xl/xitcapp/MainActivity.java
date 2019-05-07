package com.xl.xitcapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHello;
    String hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Uri uri = getIntent().getData();

        if (uri != null){
            hello = uri.getQueryParameter("username");
        } else {
            Bundle b = getIntent().getExtras();
            String username = b.getString("USERNAME");
            String password = b.getString("PASSWORD");

            hello = "Username:"+username+" password:"+password;
        }

        txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Halo "+hello);

    }

}
