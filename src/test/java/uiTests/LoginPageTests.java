package uiTests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import pageObjects.LoginPage;
import testUtils.TestRunner;

import static constants.ConstantValues.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTests extends TestRunner {

    @ParameterizedTest()
    @MethodSource("locationDataProvider")
    public void verifyErrorMessage(String location) {
        LoginPage loginPage = new LoginPage()
                .openLoginPage()
                .setUsername(username)
                .setPassword(password)
                .selectLocation(location)
                .clickLoginButton();

        assertTrue(loginPage.isErrorMessageVisible());
        assertEquals(loginPage.getErrorMessage(), expectedErrorMessage);
    }

    //if more than a few - should be moved to the separate class
    public static Object[][] locationDataProvider() {
        return new Object[][]{
                {"Inpatient Ward"},
                {"Isolation Ward"},
                {"Laboratory"},
                {"Outpatient Clinic"},
                {"Pharmacy"},
                {"Registration Desk"}
        };
    }
}
