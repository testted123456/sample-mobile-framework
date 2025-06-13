package pages;

import org.openqa.selenium.By;

public class SuccessPage extends BasePage{

    private By btnBuyCrypto = By.id("buyCrypto");

    private By btnDepositCrypto = By.id("buyCrypto");

    private By btnSkip = By.id("buyCrypto");

    public void clickBuyCrypto() {
        driver.findElement(btnBuyCrypto).click();
    }

    public void clickBtnDepositCrypto() {
        driver.findElement(btnDepositCrypto).click();
    }

    public void clickBtnSkip() {
        driver.findElement(btnSkip).click();
    }
}
