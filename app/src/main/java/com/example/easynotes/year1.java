package com.example.easynotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class year1 extends AppCompatActivity {
    ListView l1y;
    String [] sub1yr={"engg. math 1","engg. math 2","physics","chemistry","basic electrical engg.","drawing","basic electronics","fundamental of programming","communication skill"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_year1);
        l1y=findViewById(R.id.l1y);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,sub1yr);
        l1y.setAdapter(arrayAdapter);
        l1y.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                    {
                        Intent intent=new Intent(year1.this,show.class);
                        intent.putExtra("link","https://drive.google.com/file/d/1kdnofvNlfZdi-niA7VpYIeoHhcFlguq4/view?usp=sharing");
                        startActivity(intent);
                        break;
                    }
                    case 2:
                    {
                        Intent intent=new Intent(year1.this,show.class);
                        intent.putExtra("link","https://drive.google.com/file/d/10HfZeubHkap-Xk44qZ6mCfIBbwhE5qIU/view?usp=sharing");
                        startActivity(intent);
                        break;
                    }
                    case 8:
                    {
                        Intent intent=new Intent(year1.this,show.class);
                        intent.putExtra("link","https://drive.google.com/file/d/171ARwszS71P_GUIleUD-qupkW8YbKUga/view?usp=sharing");
                        startActivity(intent);
                        break;
                    }
                    case 3:
                    {
                        Intent intent=new Intent(year1.this,show.class);
                        intent.putExtra("link","https://drive.google.com/file/d/1IvC7MQJUqWVxDH2htqmGhfYawTesICBp/view?usp=sharing");
                        startActivity(intent);
                        break;
                    }
                    default:
                    {
                        Intent intent=new Intent(year1.this,reast.class);
                        startActivity(intent);
                        break;
                    }


                }

            }
        });

    }
}