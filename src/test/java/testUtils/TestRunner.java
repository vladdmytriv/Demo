package testUtils;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static utils.PropertyHelper.*;
import static com.codeborne.selenide.Configuration.*;

public class TestRunner {

    @BeforeEach
    protected void setBrowser() {
        browser = getBrowserProperty();
        browserSize = getBrowserSizeProperty();
        timeout = getTimeoutProperty();
        pageLoadTimeout = getPageLoadTimeout();
    }

    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
