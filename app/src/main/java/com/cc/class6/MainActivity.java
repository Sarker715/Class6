package com.cc.class6;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSecondActivity(View view) {
        Intent intent= new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    public void OpenGoogle(View view) {

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));

        if(intent.resolveActivity(getPackageManager()) !=null){
            startActivity((intent));
        }

    }
}
