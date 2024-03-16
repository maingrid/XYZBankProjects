package pages;

import com.codeborne.selenide.SelenideElement;
import flow.MainPageFlow;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.*;

// page_url = https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
public class MainPage {

    @FindBy(xpath = "//button[contains(text(), 'Customer')]")
    public static SelenideElement customerLoginButton;

    @FindBy(xpath = "//button[contains(text(), 'Manager')]")
    public static SelenideElement managerLoginButton;

    @FindBy(xpath = "//strong[contains(text(),'XYZ Bank')]")
    public static SelenideElement headerMainPage;

}
