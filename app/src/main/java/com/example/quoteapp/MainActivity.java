package com.example.quoteapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int TIME_INTERVAL = 2000;
    private long backPressed;

    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);




    }

    public ArrayList<Model> dataqueue(){

        ArrayList<Model> holder = new ArrayList<>();//this is container

        Model ob1 = new Model();
        ob1.setHeader("Swami Vivekananda");
        ob1.setDesc("\"Believe in yourself and the world will be at your feet\"");
        ob1.setImagename(R.drawable.swami);
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setHeader("APJ Abdul Kalam");
        ob2.setDesc("\"To succeed in your mission, you must have single minded devotion to your goal\"\n");
        ob2.setImagename(R.drawable.apj);
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setHeader("Elon Musk");
        ob3.setDesc("\"I think it is possible for ordinary people to choose to be extraordinary\"");
        ob3.setImagename(R.drawable.elon);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setHeader("Sachin Tendulkar");
        ob4.setDesc("\"When people throw stones at you, you turn them into milestones\"");
        ob4.setImagename(R.drawable.sachin);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setHeader("MS Dhoni");
        ob5.setDesc("\"I have always believed that process is more important than results\"");
        ob5.setImagename(R.drawable.dhoni);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setHeader("Bruce Lee");
        ob6.setDesc("\"Mistakes are always forgiveable, if one has the courage to admit them\"\n");
        ob6.setImagename(R.drawable.brucelee);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setHeader("Mahatma Gandhi");
        ob7.setDesc("\"In a gentle way, you can shake the world\"\n");
        ob7.setImagename(R.drawable.gandhiji);
        holder.add(ob7);

        Model ob8 = new Model();
        ob8.setHeader("Steve Jobs");
        ob8.setDesc("\"If you don't want to make everyone happy, don't be a leader , sell icecream\"");
        ob8.setImagename(R.drawable.steve);
        holder.add(ob8);

        Model ob9 = new Model();
        ob9.setHeader("Ratan Tata");
        ob9.setDesc("\"Polish your talents like you would polish your dimonds\"");
        ob9.setImagename(R.drawable.tata);
        holder.add(ob9);

        Model ob10 = new Model();
        ob10.setHeader("Mother Teresa");
        ob10.setDesc("\"If you judge people , you have no time to love them\"");
        ob10.setImagename(R.drawable.teresa);
        holder.add(ob10);

        Model ob11 = new Model();
        ob11.setHeader("Warren Buffet");
        ob11.setDesc("\"I measure sucess by how many pepople love me\"\n");
        ob11.setImagename(R.drawable.warren);
        holder.add(ob11);


        return holder;

    }

    @Override

    public void onBackPressed(){
        if(backPressed + TIME_INTERVAL > System.currentTimeMillis()){
            super.onBackPressed();
            return;
        }else{
            Toast.makeText(getBaseContext(), "Press Again to Exit", Toast.LENGTH_SHORT).show();
        }
        backPressed = System.currentTimeMillis();
    }

}