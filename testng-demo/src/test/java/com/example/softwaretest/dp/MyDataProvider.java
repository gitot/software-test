package com.example.softwaretest.dp;

import org.testng.annotations.DataProvider;

public class MyDataProvider {

    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][] {{"Value Passed"}};
    }
}
