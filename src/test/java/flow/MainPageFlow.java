package flow;

import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;

public class MainPageFlow extends MainPage {

    public static String getHeaderMainPage() {
        return headerMainPage.text();
    }

    public static void clickButtonCustomerLogin() {
        customerLoginButton.shouldBe(visible).click();
    }

    public static void clickButtonManagerLogin() {
        managerLoginButton.shouldBe(visible).click();
    }
}
