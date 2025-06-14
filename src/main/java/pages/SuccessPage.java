package pages;

import org.openqa.selenium.By;

public class SuccessPage extends BasePage{

    // assume the id of the element is 'buyCrypto'
    private By btnBuyCrypto = By.id("buyCrypto");

    private By btnDepositCrypto = By.id("buyCrypto");

    private By btnSkip = By.id("buyCrypto");

    public void clickBuyCrypto() {
        click(btnBuyCrypto);
    }

    public void clickBtnDepositCrypto() {
        click(btnDepositCrypto);
    }

    public void clickBtnSkip() {
        click(btnSkip);
    }
}
