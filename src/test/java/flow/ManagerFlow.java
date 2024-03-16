package flow;

import pages.ManagerPage;
import static com.codeborne.selenide.Condition.*;

public class ManagerFlow extends ManagerPage {

    public static void getButtonAddCustomer(){
        addCustomerButton.shouldBe(enabled);
    }
}
