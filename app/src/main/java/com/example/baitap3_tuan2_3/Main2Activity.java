package com.example.baitap3_tuan2_3;

import android.content.Intent;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button goi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitytwo_main);

        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2, Toast.LENGTH_LONG).show();

        goi=(Button)findViewById(R.id.button_Goi);
        goi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callFirstActivity();
            }
        });

    }
    public void callFirstActivity(){
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }


}
