package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import co.gofynd.gravityview.GravityView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img;
    TextView tv1,tv2;
    private GravityView gravityView;
    private boolean es = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        img = findViewById(R.id.desc_img);
        tv1 = findViewById(R.id.desc_header);
        tv2 = findViewById(R.id.desc_desc);


        init();
        if(es){
            this.gravityView.setImage(img,R.drawable.apj).center();

        }else{
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.apj);
            img.setImageBitmap(bitmap);

        }



        getSupportActionBar().setTitle("Quote");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
    }






    private void init(){
        this.img = findViewById(R.id.desc_img);
        this.gravityView = GravityView.getInstance(getBaseContext());
        this.es = gravityView.deviceSupported();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gravityView.registerListener();;
    }

    @Override
    protected void onStop() {
        super.onStop();
        gravityView.unRegisterListener();
    }






    @Override
    public boolean onSupportNavigateUp() {
       onBackPressed();
       return true;
    }
}