package tests;

import base.BaseTest;
import flow.CustomerPageFlow;
import flow.MainPageFlow;
import flow.ManagerFlow;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends BaseTest {

    @Test
    @DisplayName("Проверка загрзуки главной страницы")
    public void checkLoadedMainPage() {
        assertEquals("XYZ Bank", MainPageFlow.getHeaderMainPage(), "текст не совпал");
    }

    @Test
    @DisplayName("Проверка перехода на страницу клиенты")
    public void checkGoToPageCustomers(){
        MainPageFlow.clickButtonCustomerLogin();
        assertTrue(CustomerPageFlow.customersList.isEnabled());
    }

    @Test
    @DisplayName("Проверка перехода на страницу менеджера")
    public void checkGoToPageManager(){
        MainPageFlow.clickButtonManagerLogin();
        assertTrue(ManagerFlow.addCustomerButton.isEnabled());
        System.out.println("test");
    }

}
