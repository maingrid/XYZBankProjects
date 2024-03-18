package tests;

import base.BaseTest;
import flow.AccountPageFlow;
import flow.CustomerPageFlow;
import flow.MainPageFlow;
import org.junit.jupiter.api.Test;

public class CustomerAuthorizationTest extends BaseTest {

    String name = "Hermoine Granger";

    @Test
    public void customerAuthorization() {
        MainPageFlow.clickButtonCustomerLogin();
        CustomerPageFlow.clickListCustomers();
        CustomerPageFlow.selectCustomer(name);
        CustomerPageFlow.clickListCustomers();
        CustomerPageFlow.clickButtonLogin();
        AccountPageFlow.assertCheckWelcomeTextName(name);
    }
}
