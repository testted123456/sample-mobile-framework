package biz;

import jdk.internal.joptsimple.internal.Strings;
import pages.PasswordSetupPage;

/**
 * Biz class abstracts and define the business logic by encapsulating it in individual methods.
 */
public class PasswordSetupBiz {

    PasswordSetupPage passwordSetupPage = new PasswordSetupPage();

    /**
     * password set successfully
     * @param digits
     */
    public void createPasswordSuccess(String digits) {
        if (Strings.isNullOrEmpty(digits) || digits.length() != 6) {
            // throw exception
        }

        String[] nums = digits.split("");

        passwordSetupPage.inputDigit1(nums[0]);

        passwordSetupPage.inputDigit1(nums[1]);

        passwordSetupPage.inputDigit1(nums[2]);

        passwordSetupPage.inputDigit1(nums[3]);

        passwordSetupPage.inputDigit1(nums[4]);

        passwordSetupPage.inputDigit1(nums[5]);

        // confirm the password

        passwordSetupPage.inputDigit1(nums[0]);

        passwordSetupPage.inputDigit1(nums[1]);

        passwordSetupPage.inputDigit1(nums[2]);

        passwordSetupPage.inputDigit1(nums[3]);

        passwordSetupPage.inputDigit1(nums[4]);

        passwordSetupPage.inputDigit1(nums[5]);
    }

    /**
     * password setup failed
     * @param digits1
     * @param digits2
     */
    public void createPasswordFail(String digits1, String digits2) {
        if (Strings.isNullOrEmpty(digits1) || digits1.length() != 6) {
            // throw exception
        }

        if (Strings.isNullOrEmpty(digits2) || digits2.length() != 6) {
            // throw exception
        }

        // enter the password for the first time

        String[] nums = digits1.split("");

        passwordSetupPage.inputDigit1(nums[0]);

        passwordSetupPage.inputDigit1(nums[1]);

        passwordSetupPage.inputDigit1(nums[2]);

        passwordSetupPage.inputDigit1(nums[3]);

        passwordSetupPage.inputDigit1(nums[4]);

        passwordSetupPage.inputDigit1(nums[5]);

        // confirm the password

        nums = digits2.split("");

        passwordSetupPage.inputDigit1(nums[0]);

        passwordSetupPage.inputDigit1(nums[1]);

        passwordSetupPage.inputDigit1(nums[2]);

        passwordSetupPage.inputDigit1(nums[3]);

        passwordSetupPage.inputDigit1(nums[4]);

        passwordSetupPage.inputDigit1(nums[5]);
    }

    public void denyBiometric() {
        passwordSetupPage.clickDeny();
    }

    public void allowBiometric() {
        passwordSetupPage.clickConfirm();
    }
}
