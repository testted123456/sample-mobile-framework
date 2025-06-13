package biz;

import pages.SuccessPage;

public class SuccessBiz {

    SuccessPage successPage = new SuccessPage();

    public void navigateToBuyCrypto() {
        successPage.clickBuyCrypto();
    }

    public void navigateToDepositCrypto() {
        successPage.clickBtnDepositCrypto();
    }

    public void navigateToMainPage() {
        successPage.clickBtnSkip();
    }
}
