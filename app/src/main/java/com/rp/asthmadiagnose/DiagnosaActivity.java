package com.rp.asthmadiagnose;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class DiagnosaActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewPager viewPager;
    private SoalFragment soalFragment;
    private ImageView finish;

    private boolean[] jawaban;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosa);
        viewPager = findViewById(R.id.viewPager);
        finish = findViewById(R.id.finish);

        SoalAdapter soalAdapter = new SoalAdapter(getSupportFragmentManager());
        viewPager.setAdapter(soalAdapter);
        viewPager.setOnPageChangeListener(new PagerListener());
        soalFragment = (SoalFragment) (viewPager.getAdapter()).instantiateItem(viewPager,viewPager.getCurrentItem());

        finish.setOnClickListener(this);

        jawaban = new boolean[16];

    }
    public void setJawaban(int index, boolean jawaban){
        this.jawaban[index] = jawaban;
        update();
    }
    private void update(){
        soalFragment = (SoalFragment) (viewPager.getAdapter()).instantiateItem(viewPager,viewPager.getCurrentItem());
    }
    public void show(){
        finish.setVisibility(View.VISIBLE);
    }public void hide(){
        finish.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,HasilDiagnosaActivity.class);
        intent.putExtra("jawaban",jawaban);
        finish();
        startActivity(intent);
    }

    class PagerListener implements ViewPager.OnPageChangeListener{

        @Override
        public void onPageScrolled(int i, float v, int i1) {
           if (i==15){
               finish.setVisibility(View.VISIBLE);
           }
            else {
               finish.setVisibility(View.GONE);
           }

        }

        @Override
        public void onPageSelected(int i) {

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    }
}
