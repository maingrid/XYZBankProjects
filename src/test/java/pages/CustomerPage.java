package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {
    @FindBy(xpath = "//select[@name = 'userSelect']")
    public static SelenideElement customersList;

    @FindBy(xpath = "//select[@name='userSelect']//option[@class]")
    public static SelenideElement customer;

    @FindBy(xpath = "//button[contains(text(), 'Login')]")
    public static SelenideElement loginButton;
}
