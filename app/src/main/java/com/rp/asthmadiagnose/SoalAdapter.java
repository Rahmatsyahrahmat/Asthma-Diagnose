package com.rp.asthmadiagnose;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class SoalAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Soal> soals;

    public SoalAdapter(FragmentManager fm) {
        super(fm);
        soals = new DataSoal().getSoals();

    }

    @Override
    public Fragment getItem(int i) {
        return instance(soals.get(i).getPertanyaan(),i);
    }

    private static SoalFragment instance(String soal,int index){
        SoalFragment tryOutFragment = new SoalFragment();

        Bundle args = new Bundle();
        args.putString("soal",soal);
        args.putInt("index",index);
        tryOutFragment.setArguments(args);

        return tryOutFragment;
    }
    @Override
    public int getCount() {
        return soals.size();
    }
}
