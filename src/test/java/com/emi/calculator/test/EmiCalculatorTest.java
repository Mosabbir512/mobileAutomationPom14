package com.emi.calculator.test;

import com.emi.calculator.pages.HomePage;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends BaseTest{
    @Test
    public void calculateEmiShouldSucceed(){
        pg.navigateToPage(HomePage.class)
                .tapOnCalculateEmiButton()
                .fillLoanAmount("150000")
                .fillInterestRate("10")
                .fillLoanYears("5")
                .fillLoanMonths("6")
                .fillProcessingFee("2")
                .tapOnCalculateButton();

    }
}
