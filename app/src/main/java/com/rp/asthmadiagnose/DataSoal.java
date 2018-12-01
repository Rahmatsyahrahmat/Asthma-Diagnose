package com.rp.asthmadiagnose;

import java.util.ArrayList;

public class DataSoal {
    private ArrayList<Soal> soals;

    public DataSoal() {
        soals = new ArrayList<>();
        soals.add(new Soal("Apakah berbunyi jika anda bernafas ?",2));
        soals.add(new Soal("apakah itensitas sesak nafas anda ringan ?",3));
        soals.add(new Soal("jika anda istirahat apakah mengalami sesak nafas ?",8));
        soals.add(new Soal("waktu anda bernafas apakah berbunyi nyaring ?",7));
        soals.add(new Soal("apakah ada pernafasan cuping hidung ?",4));
        soals.add(new Soal("apakah kecepatan nafas anda meningkat ?",6));
        soals.add(new Soal("apakah anda mengalami sesat napas sedang waktu istirahat ?",4));
        soals.add(new Soal("apakah muncul bunyi ketika anda membuang dan menarik nafas ?",1));
        soals.add(new Soal("apakah ada otot yang tertarik waktu anda melakukan pernafasan dada ? ",6));
        soals.add(new Soal("waktu anda olahraga apakah kondisi tubuh anda tiba tiba memburuk ?",3));
        soals.add(new Soal("apakah anda alergi di tempat kerja anda ?",1));
        soals.add(new Soal("apakah dada anda terasa berat ?",3));
        soals.add(new Soal("apakah anda mengalami pilek ?",1));
        soals.add(new Soal("apakah hidung anda tersumbat ?",1));
        soals.add(new Soal("apakah hidung anda berlendir ?",1));
        soals.add(new Soal("apakah anda bersin-bersin di tempat kerja ?",3));
    }

    public ArrayList<Soal> getSoals() {
        return soals;
    }
}
