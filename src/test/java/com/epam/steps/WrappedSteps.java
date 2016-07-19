package com.epam.steps;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.ScenarioSteps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Andrii_Chorniak on 7/7/2016.
 */
public class WrappedSteps extends ScenarioSteps {
    protected Logger logger = LoggerFactory.getLogger(WrappedSteps.class);

    /**
     * Type text in to input
     *
     * @param element a WebElementFacade
     * @param value   the text for inputting
     */
    protected void typeToInput(WebElementFacade element, String value) {
        logger.info("Input text {} into field", value);
        logger.debug("Input text {} into field", value);
        element.type(value);
    }

    /**
     * Click on the element
     *
     * @param element a WebElementFacade
     */
    protected void click(WebElementFacade element) {
        logger.info("Click on button");
        logger.debug("Click on button");
        element.click();
    }

    /**
     * Open current page
     *
     * @param page     instance of current page
     * @param pageName name of page
     */
    protected void openPage(PageObject page, String pageName) {
        logger.info("{} page is opened", pageName);
        logger.debug("{} page is opened", pageName);
        page.open();
        getDriver().manage().window().maximize();
    }

    /**
     * Check that an element exactly matches a text value
     * @param element
     * @param expectedText
     */
    protected void elementShouldContainsOnlyText(WebElementFacade element, String expectedText){
        logger.info("Current element should contain only this text [{}]", expectedText);
        logger.debug("Current element should contain only this text [{}]", expectedText);
        element.shouldContainOnlyText(expectedText);
    }

    /**
     * Check that element is present
     * @param element
     */
    protected void elementShouldBePresent(WebElementFacade element){
        logger.info("Current element should be present.");
        logger.debug("Current element should be present.");
        element.shouldBePresent();
    }
}
