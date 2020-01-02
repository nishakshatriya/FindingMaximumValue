package com.bridgelabz.FindingMaximum;

public class FindingMaximum <E extends Comparable>{
    E value1;
    E value2;
    E value3;

    public FindingMaximum(E value1, E value2, E value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public FindingMaximum() {


    }

    public <E extends Comparable> E printMaximum(E value1, E value2, E value3) {
         E maximum = (E) value1;
        if (value2.compareTo(maximum) > 0) {
            maximum = (E) value2;
        }
        if (value3.compareTo(maximum) > 0) {
            maximum = (E) value3;
        }
        return maximum;
    }

    public Object printMaximumValue() {
        E maximum = printMaximum(value1, value2, value3);
        return maximum;
    }
}

