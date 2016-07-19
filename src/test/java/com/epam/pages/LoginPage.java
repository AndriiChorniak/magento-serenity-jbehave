package com.epam.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

import static com.epam.core.Constants.LOGIN_PAGE_URL;

/**
 * Created by Andrii_Chorniak on 6/17/2016.
 */
@DefaultUrl(LOGIN_PAGE_URL)
public class LoginPage extends PageObject {

    @FindBy(name = "login[username]")
    public static WebElementFacade FIELD_EMAIL;

    @FindBy(name = "login[password]")
    public static WebElementFacade FIELD_PASSWORD;

    @FindBy(name = "send")
    public static WebElementFacade BUTTON_LOGIN;
}
