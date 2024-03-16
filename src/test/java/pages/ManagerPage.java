package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ManagerPage {

    @FindBy(xpath = "//button[contains(text(), 'Add')]")
    public static SelenideElement addCustomerButton;
}
