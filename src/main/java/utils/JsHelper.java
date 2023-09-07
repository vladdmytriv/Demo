package utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class JsHelper {
    public static void clickOnElementByJs(SelenideElement el) {
        executeJavaScript("arguments[0].click();", el);
    }
}
