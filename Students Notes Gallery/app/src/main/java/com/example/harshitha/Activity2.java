package com.example.harshitha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;

public class Activity2 extends AppCompatActivity {
   ListView c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        c=(ListView)findViewById(R.id.ttt);
        String a[]={"5 semester","6 semester",};
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, Arrays.asList(a));

        c.setAdapter(arrayAdapter);
        c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            Intent in=new Intent(Activity2.this,Activity3.class);
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(Activity2.this,"semester 5 clicked",Toast.LENGTH_LONG).show();
                    String ab[]={"MANAGEMENT AND ENTREPRENEURSHIP FOR IT INDUSTRY","COMPUTER NETWORK AND SECURITY","DATABASE MANAGEMENT SYSTEM"
                            ,"AUTOMATA THEORY AND COMPUTABILITY","APPLICATION DEVELOPMENT USING PYTHON","UNIX PROGRAMMING",};

                    in.putExtra("g",ab);
                    in.putExtra("key",5);

                }
                if(position==1){
                    Toast.makeText(Activity2.this,"semester 6 clicked",Toast.LENGTH_LONG).show();
                    String ab[]={"SYSTEM SOFTWARE AND COMPILERS","COMPUTER GRAPHICS AND VISUALIZATION","WEB TECHNOLOGY AND ITS APPLICATIONS",
                            "(PE)DATA MINING AND DATA WAREHOUSING","(PE)CLOUD COMPUTING AND IT'S APPLICATION"


                    };

                    in.putExtra("g",ab);
                    in.putExtra("key",6);
                }



                startActivity(in);

            }
        });
    }
}