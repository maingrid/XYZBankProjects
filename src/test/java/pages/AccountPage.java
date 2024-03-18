package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage {

    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    public static SelenideElement welcomeText;
}
