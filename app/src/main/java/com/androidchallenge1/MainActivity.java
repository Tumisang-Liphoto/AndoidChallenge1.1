package com.androidchallenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create buttons
        Button Button_About_ALC = (Button) findViewById(R.id.button_about);
        Button Button_My_Profile = (Button) findViewById(R.id.button_profile);

        //OnClick listener for About ALC
        Button_About_ALC.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),About_ALC.class);
                startActivity(intent);


            }
        });

        //OnClick listener for Profile
        Button_My_Profile.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), My_Profile.class);
                startActivity(intent);

            }
        });

    }
}
