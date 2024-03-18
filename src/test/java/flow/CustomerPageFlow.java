package flow;

import pages.CustomerPage;

import static com.codeborne.selenide.Condition.*;

public class CustomerPageFlow extends CustomerPage {

    public static void clickListCustomers() {
        customersList.shouldBe(enabled).click();
    }

    public static void selectCustomer(String nameCustomer) {
        CustomerPage.customer.shouldHave(text(nameCustomer)).click();
    }

    public static void clickButtonLogin() {
        CustomerPage.loginButton.shouldBe(visible).click();
    }


}
