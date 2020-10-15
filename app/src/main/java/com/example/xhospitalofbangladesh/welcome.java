package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class welcome extends AppCompatActivity {

    private Button nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.welcome);

        nextButton = findViewById (R.id.buttonId);




        nextButton.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (welcome.this, MainActivity.class);

                startActivity (intent);


            }


        });
    }

}
