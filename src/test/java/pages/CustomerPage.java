package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {
    @FindBy(xpath = "//select[@name = 'userSelect']")
    public static SelenideElement customersList;
}
