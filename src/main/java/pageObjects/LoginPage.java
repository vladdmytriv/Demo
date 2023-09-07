package pageObjects;

import com.codeborne.selenide.SelenideElement;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.By;

import static utils.JsHelper.clickOnElementByJs;
import static utils.PageUtil.isElementVisible;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.String.format;

public class LoginPage extends Header {

    private final SelenideElement errorMessageLabel = $(By.id("error-message"));
    private final String inputsLocatorTemplate = "//*[@for='%s']/..//input";

    @Step("Open Login page by link")
    public LoginPage openLoginPage() {
        open("https://demo.openmrs.org/openmrs/referenceapplication/login.page");

        return this;
    }

    @Step("Fill Username field")
    public LoginPage setUsername(String login) {
        $x(format(inputsLocatorTemplate, "username")).sendKeys(login);

        return this;
    }

    @Step("Fill Password field")
    public LoginPage setPassword(String password) {
        $x(format(inputsLocatorTemplate, "password")).sendKeys(password);

        return this;
    }

    @Step("Select Location option")
    public LoginPage selectLocation(String location) {
        clickOnElementByJs($(By.id(location)));

        return this;
    }

    @Step("Click on Login button")
    public LoginPage clickLoginButton() {
        $(By.id("loginButton")).click();

        return this;
    }

    public String getErrorMessage() {
        return errorMessageLabel.getText();
    }

    @Step("Check is error message displayed")
    public boolean isErrorMessageVisible() {
        return isElementVisible(errorMessageLabel);
    }
}
