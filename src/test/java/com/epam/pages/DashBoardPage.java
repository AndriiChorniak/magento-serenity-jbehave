package com.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import java.util.List;

import static com.epam.core.Constants.DASHBOARD_PAGE_URL;


/**
 * Created by Andrii_Chorniak on 6/17/2016.
 */
@DefaultUrl(DASHBOARD_PAGE_URL)
public class DashBoardPage extends PageObject {

    @FindBy(xpath = "//a[@href='/products/customer/account/']")
    public static WebElementFacade PAGE_TITLE_MY_ACCOUNT;

    @FindBy(xpath = "//a[contains(@href,'logout')]")
    public static WebElementFacade LOGOUT_BUTTON;

    @FindBy(xpath = "//*[text()='Invalid login or password.']")
    public static WebElementFacade ERROR_MESSAGE_AUTHENTICATION;

    @FindBy(xpath = "//li[@class='error-msg']")
    public static WebElementFacade ERROR_FRAME;

    @FindBy(xpath = "//label/em[text()='*']")
    public static List<WebElementFacade> ASTERISKS;

    @FindBy(xpath = "//a[text()='Forgot Your Password?']")
    public static WebElementFacade FORGOT_YOUR_PASSWORD_BTN;
}
