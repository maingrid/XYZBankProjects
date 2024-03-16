package flow;

import pages.CustomerPage;
import static com.codeborne.selenide.Condition.*;
public class CustomerPageFlow extends CustomerPage {

    public static void getListCustomers() {
        customersList.shouldBe(enabled);
    }
}
