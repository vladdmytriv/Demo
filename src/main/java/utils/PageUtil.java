package utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;

public class PageUtil {

    public static boolean isElementVisible(SelenideElement element) {
        try {
            return element
                    .should(exist)
                    .is(visible);
        } catch (AssertionError exception) {
            return false;
        }
    }
}
