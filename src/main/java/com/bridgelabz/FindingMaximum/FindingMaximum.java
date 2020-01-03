package com.bridgelabz.FindingMaximum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindingMaximum <E extends Comparable>{
    E ArrayOfElements[];

    public FindingMaximum(E...Values) {
        this.ArrayOfElements=Values;
    }

    public FindingMaximum() {


    }

    public <E extends Comparable> E printMaximum(E...parameters) {
        E [] values= parameters;
        int length = parameters.length;
        Arrays.sort(parameters);
        return (values[length-1]);

    }

    public E printMaximumValue() {
        E maximum = printMaximum(ArrayOfElements);
        return maximum;
    }

}

