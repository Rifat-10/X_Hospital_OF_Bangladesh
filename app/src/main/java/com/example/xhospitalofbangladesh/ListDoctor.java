package com.example.xhospitalofbangladesh;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
public class ListDoctor extends AppCompatActivity {
    private ListView listView;
    private String[] doctorName;
    private String[] doctorType;
    private MyAdapter adapter;
    private int[] image={R.drawable.d1,R.drawable.d2,
            R.drawable.d3,R.drawable.d4,R.drawable.d5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_list);
        listView= findViewById(R.id.listViewId);
        doctorName= getResources().getStringArray(R.array.doctor_Name);
        doctorType= getResources().getStringArray(R.array.doctor_type);
        adapter= new MyAdapter(doctorName,doctorType,image,ListDoctor.this);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value= doctorName[position];

                Toast.makeText(ListDoctor.this, ""+value, Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(ListDoctor.this,ProfileActivity.class);
                intent.putExtra (value, image);
                startActivity (intent);

                intent.putExtra ("player_name", value);
                startActivity (intent);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder= new AlertDialog.Builder(ListDoctor.this);
                builder.setTitle("Delete").setIcon(R.drawable.ic_delete).setMessage("Do you want to delete ?")
                        .setCancelable(true).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String value= doctorName[position];
                        Toast.makeText(ListDoctor.this, "Delete: "+value, Toast.LENGTH_SHORT).show();
                    }
                }).create().show();

                return true;
            }
        });


    }
}
}
