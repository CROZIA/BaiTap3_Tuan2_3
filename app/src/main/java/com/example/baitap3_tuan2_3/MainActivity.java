package com.example.baitap3_tuan2_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button goi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goi=(Button)findViewById(R.id.button_Goi);
        goi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callSecondActivity();
            }
        });
    }

    public void callSecondActivity(){
        Intent i = new Intent(getApplicationContext(), Main2Activity.class);
        i.putExtra("Value1", "Xin chao cac ban");
        i.putExtra("Value2", "Toi la Huynh Nhat Thien");
        startActivity(i);
    }
}
