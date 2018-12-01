package com.rp.asthmadiagnose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textDiagnosa1, textDiagnosa2;
    private ImageView diagnosa, jenisAsma, help, out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        listener();
    }
    private void bindView(){
        textDiagnosa1 = findViewById(R.id.mainDiagnosaText1);
        textDiagnosa2 = findViewById(R.id.mainDiagnosaText2);
        diagnosa = findViewById(R.id.mainDiagnosaImage);
        jenisAsma = findViewById(R.id.mainJenisAsma);
        help = findViewById(R.id.mainHelp);
        out = findViewById(R.id.mainLogOut);
    }
    private void listener(){
        textDiagnosa1.setOnClickListener(this);
        textDiagnosa2.setOnClickListener(this);
        diagnosa.setOnClickListener(this);
        jenisAsma.setOnClickListener(this);
        help.setOnClickListener(this);
        out.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mainDiagnosaText1:
                intent(DiagnosaActivity.class);
                break;
            case R.id.mainDiagnosaText2:
                intent(DiagnosaActivity.class);
                break;
            case R.id.mainDiagnosaImage:
                intent(DiagnosaActivity.class);
                break;
            case R.id.mainJenisAsma:
                intent(JenisAsmaActivity.class);
                break;
            case R.id.mainHelp:
                break;
            case R.id.mainLogOut:
                onBackPressed();
                break;
        }
    }
    private void intent(Class<?> cls){
        Intent intent = new Intent(this,cls);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
