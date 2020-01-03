package com.bridgelabz.Test;
import com.bridgelabz.FindingMaximum.FindingMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindingMaximumTest {


    @Test
    public void WhenGivenIntValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(50, 20, 10);
        Assert.assertEquals(Integer.valueOf(50), result);
    }

    @Test
    public void WhenGivenIntValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 50, 20);
        Assert.assertEquals(Integer.valueOf(50), result);

    }

    @Test
    public void WhenGivenIntValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 20, 50);
        Assert.assertEquals(Integer.valueOf(50), result);
    }

    @Test
    public void WhenGivenFloatValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(50.5f, 20.5f, 10.5f);
        Assert.assertEquals(Float.valueOf(50.5f), result);
    }

    @Test
    public void WhenGivenFloatValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(20.5f, 50.5f, 10.5f);
        Assert.assertEquals(Float.valueOf(50.5f), result);
    }

    @Test
    public void WhenGivenFloatValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        Float result = (Float) maximum.printMaximum(20.5f, 10.5f, 50.5f);
        Assert.assertEquals(Float.valueOf(50.5f), result);
    }

    @Test
    public void WhenGivenStringValues_IfFirstPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("Java", "C", ".Net");
        Assert.assertEquals(String.valueOf("Java"), result);
    }

    @Test
    public void WhenGivenStringValues_IfSecondPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("C", "Java", ".Net");
        Assert.assertEquals(String.valueOf("Java"), result);
    }

    @Test
    public void WhenGivenStringValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum = new FindingMaximum();
        String result = (String) maximum.printMaximum("C", ".Net", "Java");
        Assert.assertEquals(String.valueOf("Java"), result);
    }

    @Test
    public void WhenGivenGeneric_ShouldReturnMaxInt() {
        FindingMaximum maximum = new FindingMaximum(50, 20, 10);
        Object result = maximum.printMaximumValue();
        Assert.assertEquals(Integer.valueOf(50), result);

    }

    @Test
    public void WhenGivenGeneric_ShouldReturnMaxFloat() {
        FindingMaximum maximum = new FindingMaximum(50.5f, 20.5f, 10.5f);
        Object result = maximum.printMaximumValue();
        Assert.assertEquals(Float.valueOf(50.5f), result);
    }

    @Test
    public void WhenGivenGeneric_ShouldReturnMaxString() {
        FindingMaximum maximum = new FindingMaximum("Java", "C", ".Net");
        Object result = maximum.printMaximumValue();
        Assert.assertEquals(String.valueOf("Java"), result);
    }

    @Test
    public void WhenGivenMoreThanThreeStringValues_ShouldReturnMaxValues() {
        FindingMaximum maximum = new FindingMaximum("Apple", "Banana", "Strawberry", "Mango");
        Object result = maximum.printMaximumValue();
        Assert.assertEquals(String.valueOf("Strawberry"), result);
    }

    @Test
    public void WhenGivenMoreThanThreeIntValues_ShouldReturnMaxValues() {
        FindingMaximum maximum = new FindingMaximum(12, 99, 34, 67, 55, 45, 23);
        Object result = maximum.printMaximumValue();
        Assert.assertEquals(Integer.valueOf(99), result);
    }
}