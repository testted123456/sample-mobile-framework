package pages;

import org.openqa.selenium.By;

/**
 * The page class is responsible only for defining page elements and performing atomic operations on them.
 */
public class PortalPage extends BasePage {

    // assume the element's id is 'createWallet'
    private By btnCreateWallet = By.id("createWallet");

    private By btnImportWallet = By.id("importWallet");

    public void clickBtnCreateWallet() {
        click(btnCreateWallet);
    }

    public void clickBtnImportWallet() {
        click(btnImportWallet);
    }

}
