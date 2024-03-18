package flow;

import pages.AccountPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountPageFlow extends AccountPage {

    public static void assertCheckWelcomeTextName(String name) {
        assertEquals(name, AccountPage.welcomeText.getText());
    }

}
