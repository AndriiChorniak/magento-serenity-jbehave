package com.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static com.epam.core.Constants.FORGOT_PASSWORD_PAGE_URL;

/**
 * Created by Andrii_Chorniak on 7/19/2016.
 */

@DefaultUrl(FORGOT_PASSWORD_PAGE_URL)
public class ForgotPasswordPage extends PageObject {

    @FindBy(xpath = "//div[@class='page-title']/h1")
    public static WebElementFacade PAGE_TITLE_FORGOT_PASSWORD;

    @FindBy(xpath = "//p[@class='back-link']/a")
    public static WebElementFacade GO_BACK_BTN;
}
