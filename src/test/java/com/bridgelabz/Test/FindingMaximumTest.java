package com.bridgelabz.Test;
import com.bridgelabz.FindingMaximum.FindingMaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindingMaximumTest {
    @Test
    public void WhenGivenThreeValues_IfFirstLocationHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum =new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(50, 20 , 10);
        Integer expectedResult=50;
        Assert.assertEquals(expectedResult,Integer.valueOf(result));
    }

    @Test
    public void WhenGivenThreeValues_IfSecondLocationHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum =new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 50 , 20);
        Integer expectedResult=50;
        Assert.assertEquals(expectedResult,Integer.valueOf(result));

    }

    @Test
    public void WhenGivenThreeValues_IfThirdPosHasMax_ShouldReturnMaximum() {
        FindingMaximum maximum =new FindingMaximum();
        Integer result = (Integer) maximum.printMaximum(10, 20 , 50);
        Integer expectedResult=50;
        Assert.assertEquals(expectedResult,Integer.valueOf(result));
    }
}
