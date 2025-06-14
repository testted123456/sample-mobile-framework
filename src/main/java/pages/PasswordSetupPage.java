package pages;

import org.openqa.selenium.By;

public class PasswordSetupPage extends BasePage{

    // assume the password element's id is d1, d2...
    private By ibDigit1 = By.id("d1");

    private By ibDigit2 = By.id("d2");

    private By ibDigit3 = By.id("d3");

    private By ibDigit4 = By.id("d4");

    private By ibDigit5 = By.id("d5");

    private By ibDigit6 = By.id("d6");

    private By wdBiometricLogin = By.id("bl");

    private By btnDeny = By.id("deny");

    private By btnConfirm = By.id("confirm");

    public void inputDigit1(String digit) {
        sendKeys(ibDigit1, digit);
    }

    public void inputDigit2(String digit) {
        sendKeys(ibDigit2, digit);
    }

    public void inputDigit3(String digit) {
        sendKeys(ibDigit3, digit);
    }

    public void inputDigit4(String digit) {
        sendKeys(ibDigit4, digit);
    }

    public void inputDigit5(String digit) {
        sendKeys(ibDigit5, digit);
    }

    public void inputDigit6(String digit) {
        sendKeys(ibDigit6, digit);
    }

    public void clickDeny() {
        click(btnDeny);
    }

    public void clickConfirm() {
        click(btnConfirm);
    }
}
