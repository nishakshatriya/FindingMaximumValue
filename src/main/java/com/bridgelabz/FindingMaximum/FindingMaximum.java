package com.bridgelabz.FindingMaximum;
import java.util.Arrays;

public class FindingMaximum <E extends Comparable>{
    E ArrayOfElements[];

    public FindingMaximum(E...Values) {
        this.ArrayOfElements=Values;
    }

    public FindingMaximum() {

    }

    public <E extends Comparable> E CheckMaximumValue(E...parameters) {
        E [] values= parameters;
        int length = parameters.length;
        Arrays.sort(values);
        E max=values[length-1];
        printMax(max);
        return max;

    }

    public Object GettingMaximumValue() {
        E maximum = CheckMaximumValue(ArrayOfElements);
        return maximum;
    }

    public <E extends Comparable> void printMax(E maximum) {
        System.out.println("Maximum value is : "+maximum);
    }

}

