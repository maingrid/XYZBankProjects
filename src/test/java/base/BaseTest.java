package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.AccountPage;
import pages.CustomerPage;
import pages.MainPage;
import pages.ManagerPage;


import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class BaseTest {
    MainPage mainPage;
    CustomerPage customerPage;
    ManagerPage managerPage;
    AccountPage accountPage;
    public static void baseStartConfig() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 60000;
    }

    @BeforeEach
    public void before() {
        baseStartConfig();
        open("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        mainPage = page();
        customerPage = page();
        managerPage = page();
        accountPage = page();
    }

    @AfterEach
    void afterMethod() {
        Selenide.closeWebDriver();
    }

}
