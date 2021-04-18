package com.example.softwaretest;

import com.example.softwaretest.dp.MyDataProvider;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"First-Value"}, {"Second-Value"}};
    }

    @Test(dataProvider = "data-provider")
    public void dpTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = MyDataProvider.class)
    public void dpClassTest (String val) {
        System.out.println("Current Status : " + val);
    }

    @DataProvider (name = "data-provider-multipleParam")
    public Object[][] dpMethod_multipleParam(){
        return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
    }

    @Test (dataProvider = "data-provider-multipleParam")
    public void myTest (int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    @DataProvider (name = "data-provider-condition")
    public Object[][] dpMethod (Method m){
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
        }
        return null;
    }

    @Test (dataProvider = "data-provider-condition")
    public void Sum (int a, int b, int result) {
        int sum = a + b;
        Assert.assertEquals(result, sum);
    }

    @Test (dataProvider = "data-provider-condition")
    public void Diff (int a, int b, int result) {
        int diff = a - b;
        Assert.assertEquals(result, diff);
    }
}
