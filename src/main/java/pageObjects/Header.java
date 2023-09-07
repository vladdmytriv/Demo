package pageObjects;

import net.serenitybdd.annotations.Step;

import static utils.PageUtil.isElementVisible;
import static com.codeborne.selenide.Selenide.$x;

public class Header {

    @Step("Check is Header displayed on current page")
    public boolean isHeaderVisible() {
        return isElementVisible($x("//header"));
    }

    //Method returns void, as Home Page doesn`t exist for now
    @Step("Go to Home page by clicking on Header")
    public void goToHomePage() {
        $x("//*[@class='logo']").click();
    }
}
