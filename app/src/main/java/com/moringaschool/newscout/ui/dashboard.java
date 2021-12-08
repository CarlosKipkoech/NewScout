package com.moringaschool.newscout.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.moringaschool.newscout.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class dashboard extends AppCompatActivity {
    @BindView(R.id.imageViewTechnology)
    ImageView mImageViewTechnology;
    @BindView( R.id.imageViewEntertainment) ImageView mImageViewEntertainment;
    @BindView(R.id.imageViewSports) ImageView mImageViewSports;
    @BindView(R.id.imageViewBusiness) ImageView mImageViewBusiness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ButterKnife.bind(this);

        mImageViewSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,SPortsNews.class);
                startActivity(intent);
            }
        });

        mImageViewEntertainment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,EntertainmentNews.class);
                startActivity(intent);
            }
        });

        mImageViewBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,Business.class);
                startActivity(intent);
            }
        });

        mImageViewTechnology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(dashboard.this,TechonologyNews.class);
                startActivity(intent);
            }
        });
    }
}