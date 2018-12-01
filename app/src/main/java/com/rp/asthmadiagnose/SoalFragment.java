package com.rp.asthmadiagnose;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SoalFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {
    private View rootView;
    private TextView soal;
    private RadioButton iya, tidak;
    private RadioGroup radioGroup;

    private Bundle bundle;

    private String sSoal;
    private int index;

    private DiagnosaActivity diagnosaActivity;

    public SoalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_soal, container, false);

        bundle = getArguments();
        sSoal = bundle.getString("soal");
        index = bundle.getInt("index");
        diagnosaActivity = (DiagnosaActivity) getActivity();
        soal = rootView.findViewById(R.id.diagnosaSoal);
        iya = rootView.findViewById(R.id.diagnosaIya);
        tidak = rootView.findViewById(R.id.diagnosaTidak);
        radioGroup = rootView.findViewById(R.id.radioGroup);
        Log.i("index", String.valueOf(sSoal));
        soal.setText(sSoal);
        radioGroup.setOnCheckedChangeListener(this);

        return rootView;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId==iya.getId()){
            diagnosaActivity.setJawaban(index,true);
        }
        else {
            diagnosaActivity.setJawaban(index,false);
        }
    }
    public int getIndex(){
        return index;
    }
}
