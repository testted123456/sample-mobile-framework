package pages;

import org.openqa.selenium.By;

public class PasswordSetupPage extends BasePage{

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
        driver.findElement(ibDigit1).sendKeys(digit);
    }

    public void inputDigit2(String digit) {
        driver.findElement(ibDigit2).sendKeys(digit);
    }

    public void inputDigit3(String digit) {
        driver.findElement(ibDigit3).sendKeys(digit);
    }

    public void inputDigit4(String digit) {
        driver.findElement(ibDigit4).sendKeys(digit);
    }

    public void inputDigit5(String digit) {
        driver.findElement(ibDigit5).sendKeys(digit);
    }

    public void inputDigit6(String digit) {
        driver.findElement(ibDigit6).sendKeys(digit);
    }

    public void clickDeny() {
        wait.until(d -> {
            driver.findElement(btnDeny).click();
            return true;
        });
    }

    public void clickConfirm() {
        wait.until(d -> {
            driver.findElement(btnConfirm).click();
            return true;
        });
    }
}
