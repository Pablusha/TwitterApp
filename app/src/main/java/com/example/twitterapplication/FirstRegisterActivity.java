package com.example.twitterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FirstRegisterActivity extends AppCompatActivity {

    private ImageView imgExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_register);

    }
    private void exit() {
        imgExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void initViews() {
        imgExit = findViewById(R.id.imgExitApp);
    }
}