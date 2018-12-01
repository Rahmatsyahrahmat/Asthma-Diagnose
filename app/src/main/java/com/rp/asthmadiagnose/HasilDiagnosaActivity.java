package com.rp.asthmadiagnose;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HasilDiagnosaActivity extends AppCompatActivity {
    private TextView hasil, solusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_diagnosa);

        hasil = findViewById(R.id.hasil);
        solusi = findViewById(R.id.solusi);

        Bundle bundle = getIntent().getExtras();
        boolean[]jawaban = bundle.getBooleanArray("jawaban");
        int point = 0;
        ArrayList<Soal> soals = new DataSoal().getSoals();
        for (int i=0;i<jawaban.length;i++){
            if (jawaban[i]){
                point = point+soals.get(i).getPoint();
            }
        }
        if (point>=25){
            hasil.setText("ASMA BERAT");
            solusi.setText("Dapat diberikan nebulizer, beri oksigen dan suntik obat-obatan penyakit asma");
        }
        else if (point>=19){
            hasil.setText("ASMA SEDANG");
            solusi.setText("Dapat diberikan nebulizer, beri oksigen dan obat-obatan oral.");
        }
        else if (point>=14){
            hasil.setText("ASMA RINGAN");
            solusi.setText("Dapat diberikan nebulizer dan obat-obatan oral");
        }
        else if (point>=11){
            hasil.setText("ASMA KARENA OLAHRAGA BERAT");
            solusi.setText("Pilih dan batasi beberapa jenis olahraga serta konsultasikan dengan profesional kesehatan atau dokter");
        }
        else if (point>=8){
            hasil.setText("ASMA KARENA TEMPAT KERJA");
            solusi.setText("Memilih tempat kerja dengan lingkungan yang baik dengan sirkulasi udara yang baik. Jika masih mengalami kambuh. Maka, segera konsultasikan dengan dokter");
        }
        else if (point>=6){
            hasil.setText("ASMA KARENA SUHU DINGIN");
            solusi.setText("Pakai pakaian tebal atau apapun yang dapat menghangatkan tubuh. Untuk mencegah terjadinya pilek ataupun hidung tersumbat");
        }
        else {
            hasil.setText("SEHAT BOSS");
            solusi.setText("");
        }

    }

    @Override
    public void onBackPressed() {
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
