package com.example.harshitha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Activity3 extends AppCompatActivity {
    ListView c;
    TextView t;
    String link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        c=(ListView)findViewById(R.id.fith);
        t=(TextView)findViewById(R.id.textView3);
        Intent i=getIntent();
        String a[]=i.getStringArrayExtra("g");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, Arrays.asList(a));
        int d=i.getIntExtra("key",0);
        String h=i.getStringExtra("k1");
        if(d==5){
            t.setText("5th SEMESTER SUBJECTS ");
        }
        else if(d==6){
            t.setText("6th SEMESTER SUBJECTS ");
        }

        c.setAdapter(arrayAdapter);

        c.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(d==5){

                    if (position == 0) {

                        link = "https://drive.google.com/drive/folders/1Q8tMG6UxRuO08Q3s5szcjBJkNuBnSDIZ?usp=drive_link";
                    } else if (position == 1) {
                        link = "https://drive.google.com/drive/folders/1iN0KAty12HXqpN02bhAaVI5TIqo7q8ul?usp=drive_link";
                    } else if (position == 2) {
                        link = "https://drive.google.com/drive/folders/1CmOV8jA0YWjMYtJHeoO4tbAPYOMQ6sT-?usp=drive_link";
                    } else if (position == 3) {
                        link = "https://drive.google.com/drive/folders/1oWQ85qtDVU0Z5UTiV694ybVWkZ4Flymo?usp=drive_link";
                    } else if (position == 4) {
                        link = "https://drive.google.com/drive/folders/1VtRHZD7OlBu3kwYrnNf8-lh99p3uKpfk?usp=drive_link";
                    } else if (position == 5) {
                        link = "https://drive.google.com/drive/folders/1S4EcpZd431yTx3HrVC4UFgqlIWXSRXeG?usp=drive_link";
                    }
                }
                else if(d==6){

                    if (position == 0) {
                        link = "https://drive.google.com/drive/folders/1sDa5LKuGhU651j1H6EZpi59L5tBbNtK3?usp=drive_link";
                    } else if (position == 1) {
                        link = "https://drive.google.com/drive/folders/1YbfquNH1vkwHDMA9xNGxJZtHL74rbTSx?usp=drive_link";
                    } else if (position == 2) {
                        link = "https://drive.google.com/drive/folders/1uaG2zUs0b0lyOC1tqPewQakpCjFGVQ0t?usp=drive_link";
                    } else if (position == 3) {
                        link = "https://drive.google.com/drive/folders/1OMwaenpccV4XHp5DPYvHcAMPUG10oDFw?usp=drive_link";
                    } else if (position == 4) {
                        link = "https://drive.google.com/drive/folders/1zcayLGSnU6QK0guQXUSYINujbTdJenlU?usp=drive_link";
                    }

                }


                Toast.makeText(Activity3.this,"clicked",Toast.LENGTH_LONG).show();


                Intent in=new Intent(Activity3.this,Activity4.class);
                in.putExtra("j",link);
                startActivity(in);
            }
        });

    }

}