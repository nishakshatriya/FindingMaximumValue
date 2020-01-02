package com.bridgelabz.Test;
import com.bridgelabz.FindingMaximum.FindingMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindingMaximumTest {
    @Test
    public void WhenGivenIntValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(50, 20, 10);
        Integer expectedResult = 50;
        Assert.assertEquals(expectedResult, Integer.valueOf(result));
    }

    @Test
    public void WhenGivenIntValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 50, 20);
        Integer expectedResult = 50;
        Assert.assertEquals(expectedResult, Integer.valueOf(result));

    }

    @Test
    public void WhenGivenIntValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 20, 50);
        Integer expectedResult = 50;
        Assert.assertEquals(expectedResult, Integer.valueOf(result));
    }

    @Test
    public void WhenGivenFloatValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(50.5f, 20.5f, 10.5f);
        Float expectedResult = 50.5f;
        Assert.assertEquals(expectedResult, Float.valueOf(result));
    }

    @Test
    public void WhenGivenFloatValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(20.5f, 50.5f, 10.5f);
        Float expectedResult = 50.5f;
        Assert.assertEquals(expectedResult, Float.valueOf(result));
    }

    @Test
    public void WhenGivenFloatValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(20.5f, 10.5f, 50.5f);
        Float expectedResult = 50.5f;
        Assert.assertEquals(expectedResult, Float.valueOf(result));
    }

    @Test
    public void WhenGivenStringValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("Java", "C", ".Net");
        String expectedResult = "Java";
        Assert.assertEquals(expectedResult, String.valueOf(result));
    }

    @Test
    public void WhenGivenStringValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("C", "Java", ".Net");
        String expectedResult = "Java";
        Assert.assertEquals(expectedResult, String.valueOf(result));
    }
    @Test
    public void WhenGivenStringValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("C", ".Net", "Java");
        String expectedResult = "Java";
        Assert.assertEquals(expectedResult, String.valueOf(result));
    }
}