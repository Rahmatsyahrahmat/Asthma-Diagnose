package com.rp.asthmadiagnose;

public class Soal {
    private String pertanyaan;
    private int point;

    public Soal(String pertanyaan, int point) {
        this.pertanyaan = pertanyaan;
        this.point = point;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }


    public int getPoint() {
        return point;
    }
}
