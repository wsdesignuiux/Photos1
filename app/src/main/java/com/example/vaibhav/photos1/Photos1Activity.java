package com.example.vaibhav.photos1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.Photo_adapter;
import model.Photo_model;

public class Photos1Activity extends AppCompatActivity implements View.OnClickListener {
    Integer image_photo[] ={R.drawable.image1,R.drawable.fox,R.drawable.gate,R.drawable.image1,
            R.drawable.fox,R.drawable.gate,R.drawable.image1,R.drawable.fox,
            R.drawable.gate,R.drawable.fox,R.drawable.image1,R.drawable.gate,
            R.drawable.image1,R.drawable.fox,R.drawable.gate,R.drawable.image1,
            R.drawable.image2,R.drawable.gate,R.drawable.image1,R.drawable.image2,
            R.drawable.gate,R.drawable.image2,R.drawable.fox};

    private RecyclerView recyclerView;
    private Photo_adapter photo_adapter;
    private ArrayList<Photo_model> photo_models;

    LinearLayout li1,li2,li3;
    TextView t1,t2,t3;
    ImageView img1,img2,img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos1); recyclerView = findViewById(R.id.photo);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Photos1Activity.this,5);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        photo_models = new ArrayList<>();

        for (int i = 0; i < image_photo.length; i++) {
            Photo_model ab = new Photo_model(image_photo[i]);
            photo_models.add(ab);
        }
        photo_adapter = new Photo_adapter(Photos1Activity.this, photo_models);
        recyclerView.setAdapter(photo_adapter);

        li1 = findViewById(R.id.li1);
        li2 = findViewById(R.id.li2);
        li3 = findViewById(R.id.li3);

        t1= findViewById(R.id.t1);
        t2= findViewById(R.id.t2);
        t3= findViewById(R.id.t3);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        li1.setOnClickListener(this);
        li2.setOnClickListener(this);
        li3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.li1:
                img1.setImageResource(R.drawable.ic_baseline_assistant_red);
                img2.setImageResource(R.drawable.ic_baseline_photo_black);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_black);

                t1.setTextColor(Color.parseColor("#cb0000"));
                t2.setTextColor(Color.parseColor("#8a000000"));
                t3.setTextColor(Color.parseColor("#8a000000"));
                break;

            case R.id.li2:
                img1.setImageResource(R.drawable.ic_baseline_assistant_black);
                img2.setImageResource(R.drawable.ic_baseline_photo_red);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_black);

                t1.setTextColor(Color.parseColor("#8a000000"));
                t2.setTextColor(Color.parseColor("#cb0000"));
                t3.setTextColor(Color.parseColor("#8a000000"));
                break;

            case R.id.li3:
                img1.setImageResource(R.drawable.ic_baseline_assistant_black);
                img2.setImageResource(R.drawable.ic_baseline_photo_black);
                img3.setImageResource(R.drawable.ic_baseline_bookmard_red);

                t1.setTextColor(Color.parseColor("#8a000000"));
                t2.setTextColor(Color.parseColor("#8a000000"));
                t3.setTextColor(Color.parseColor("#cb0000"));
                break;
        }
    }
}
