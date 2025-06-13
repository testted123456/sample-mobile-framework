package biz;

import pages.PortalPage;

public class PortalBiz {

    PortalPage portalPage = new PortalPage();

    public void createWallet() {
        portalPage.clickBtnCreateWallet();
    }

    public void importWallet() {
        portalPage.clickBtnImportWallet();
    }

}
