package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.desc_img);
        tv1 = findViewById(R.id.desc_header);
        tv2 = findViewById(R.id.desc_desc);

        getSupportActionBar().setTitle("Quote");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
    }

    @Override
    public boolean onSupportNavigateUp() {
       onBackPressed();
       return true;
    }
}