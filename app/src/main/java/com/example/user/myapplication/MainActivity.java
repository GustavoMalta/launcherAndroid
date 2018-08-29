package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.keep");
      //  startActivity(launchIntent);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),AppListActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed(){
         //faz nada

    }

}
