package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utils.DriverUtils;
import java.time.Duration;

public class BasePage {

    protected AppiumDriver driver;

    FluentWait<AppiumDriver> wait;

    public BasePage() {
        this.driver = DriverUtils.getDriver();

        this.wait = new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(2))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(ElementNotInteractableException.class);

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    void click(By by) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    void sendKeys(By by, String text) {
        WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        inputField.sendKeys(text);
    }

    boolean checkVisible(By by) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    void acceptAlert() {
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = DriverUtils.getDriver().switchTo().alert();

        alert.accept();
    }

    void dismissAlert() {
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = DriverUtils.getDriver().switchTo().alert();

        alert.dismiss();
    }

}
