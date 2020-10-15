package com.example.xhospitalofbangladesh;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    private TextView heading,details;
    private ImageView imageView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        heading= findViewById(R.id.detailsHeadingId);
        details= findViewById(R.id.detailsId);
        imageView= findViewById (R.id.singleImageId);

        String value= getIntent().getStringExtra("doctor_name");

        if(value.equals("Dr.Rifat")){
            setTitle("Rifat Ahasan");
            imageView.setImageResource (R.drawable.d1);
            heading.setText("Dr.Rifat's Details:");
            String src;

            details.setText(R.string.Dr_Rifat);
        }


        else if(value.equals("Dr.Ria")){
            setTitle("Ria Ahasan");
            imageView.setImageResource (R.drawable.d2);
            heading.setText("Dr.Ria's Details:");
            details.setText(R.string.Dr_Ria);

        }
        else if(value.equals("Dr.Minhaz")){
            setTitle("K M Minhaz");
            imageView.setImageResource (R.drawable.d3);
            heading.setText("Dr.Minhaz's Details:");
            details.setText(R.string.Dr_Minhaz);

        }
        else if(value.equals("Dr.Monisha")){
            setTitle("Tamanna Monisha ");
            imageView.setImageResource (R.drawable.d6);
            heading.setText("Dr.Monisha's Details:");
            details.setText(R.string.Dr_Monisha);

        }

        else if(value.equals(" ")){
            setTitle(" ");
            imageView.setImageResource (R.drawable.d4);
            heading.setText("   Details:");
            details.setText(R.string.  );

        }

        else if(value.equals("   ")){
            setTitle("   ");
            imageView.setImageResource (R.drawable.d5.bill);
            heading.setText("  Details:");
            details.setText(R.string.  );

        }


    }
}