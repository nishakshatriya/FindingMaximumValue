package com.bridgelabz.FindingMaximum;

public class FindingMaximum {

    public Integer printMaximum(Integer value1, Integer value2, Integer value3) {
        Integer maximum = value1;
        if(value2.compareTo(maximum)>0) {
            maximum = value2;
        }
        if (value3.compareTo(maximum)>0) {
            maximum = value3;
        }

        return maximum;
    }
}
