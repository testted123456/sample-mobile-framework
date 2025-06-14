package tests;

import base.BaseTest;
import biz.PasswordSetupBiz;
import biz.PortalBiz;
import biz.SuccessBiz;
import listerner.RetryAnalyzer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ExcelUtils;

/**
 * Test case is responsible for testing business workflows and orchestrating the methods defined in the Biz class.
 */
public class CreateWalletTest extends BaseTest {

    PortalBiz portalBiz = new PortalBiz();

    PasswordSetupBiz passwordSetupBiz = new PasswordSetupBiz();

    SuccessBiz successBiz = new SuccessBiz();

    // retrieve test data from excel file
    @DataProvider(name="successData")
    public Object[][] provider() throws Exception {
        return ExcelUtils.getTableArray("resources/createWallet.xlsx", "success");
    }


    @Test(dataProvider = "successData", retryAnalyzer = RetryAnalyzer.class)
    public void testCreateWalletSuccess(String digits) {
        test.info("begin to create wallet...");

        portalBiz.createWallet();

        test.info("begin to set password...");

        passwordSetupBiz.createPasswordSuccess(digits);

        test.info("create wallet success...");

        successBiz.navigateToMainPage();
    }
}
