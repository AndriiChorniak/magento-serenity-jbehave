package com.epam.steps.serenity;

import com.epam.pages.DashBoardPage;
import com.epam.pages.ForgotPasswordPage;
import com.epam.pages.LoginPage;
import com.epam.steps.WrappedSteps;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.SoftAssertions;

import static com.epam.core.Constants.*;
import static com.epam.pages.DashBoardPage.*;
import static com.epam.pages.ForgotPasswordPage.PAGE_TITLE_FORGOT_PASSWORD;
import static com.epam.pages.LoginPage.*;
import static org.assertj.core.api.Assertions.assertThat;

public class EndUserSteps extends WrappedSteps {
    LoginPage loginPage;
    DashBoardPage dashBoardPage;
    ForgotPasswordPage forgotPasswordPage;

    @Step
    public void openLoginPage() {
        openPage(loginPage, "Login");
    }

    @Step
    public void fillInEmail(String email) {
        typeToInput(FIELD_EMAIL, email);
    }

    @Step
    public void fillInPassword(String password) {
        typeToInput(FIELD_PASSWORD, password);
    }

    @Step
    public void pressLoginButton() {
        click(BUTTON_LOGIN);
    }

    @Step
    public void verifyOnDashboardPage() {
        elementShouldContainsOnlyText(PAGE_TITLE_MY_ACCOUNT, "My Account");
    }

    @Step
    public void verifyLoggedIn() {
        elementShouldBePresent(LOGOUT_BUTTON);
    }

    @Step
    public void verifyErrorMessage() {
        elementShouldBePresent(ERROR_MESSAGE_AUTHENTICATION);
        assertThat(dashBoardPage.element(ERROR_FRAME).getCssValue("color")).isEqualTo(RED_COLOR);
    }

    @Step
    public void verifyAsterisks() {
        SoftAssertions softAssert = new SoftAssertions();
        logger.info("Assert that there are two asterisks");
        logger.debug("Assert that there are two asterisks");
        assertThat(ASTERISKS).hasSize(2);
        logger.info("Assert that asterisks present");
        logger.debug("Assert that asterisks present");
        assertThat(ASTERISKS.get(0).getText()).isEqualTo("*");
        assertThat(ASTERISKS.get(1).getText()).isEqualTo("*");
     }

    @Step
    public void pressForgotPassBtn() {
        click(FORGOT_YOUR_PASSWORD_BTN);
    }

    @Step
    public void verifyForgotPassPage() {
        logger.info("Verify that current URL is Dashboard page");
        logger.debug("Verify that current URL is Dashboard page");
        assertThat(getDriver().getCurrentUrl()).isEqualTo(FORGOT_PASSWORD_PAGE_URL);
        elementShouldContainsOnlyText(PAGE_TITLE_FORGOT_PASSWORD, "Forgot Your Password?");
    }
}