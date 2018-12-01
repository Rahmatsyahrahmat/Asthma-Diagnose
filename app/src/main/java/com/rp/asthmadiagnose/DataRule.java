package com.rp.asthmadiagnose;

import java.util.ArrayList;

public class DataRule {
    private int[][] rule;
    public DataRule() {
        int [][]rule = {
                {3,4,5,9},
                {6,2,7,4,9},
                {6,2,7,8},
                {1,10,6},
                {11,12,16,8},
                {13,15,14,17,4}
        };
        this.rule = rule;
    }

    public int[][] getRule() {
        return rule;
    }
}
