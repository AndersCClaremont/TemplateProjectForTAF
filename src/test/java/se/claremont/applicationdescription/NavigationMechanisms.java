package se.claremont.applicationdescription;

import se.claremont.autotest.common.logging.LogLevel;
import se.claremont.autotest.common.testcase.TestCase;
import se.claremont.autotest.websupport.webdrivergluecode.WebInteractionMethods;

/**
 * Created by jordam on 2016-12-04.
 */
public class NavigationMechanisms {
    TestCase testCase;
    WebInteractionMethods web;

    public NavigationMechanisms(WebInteractionMethods web){
        this.testCase = web.getTestCase();
        this.web = web;
    }

    public void ensureLandingPageDisplayed(){
        if(web.pageTitleExistWithTimeout("Claremont", 1)){
            web.log(LogLevel.DEBUG, "Made sure the landing page was displayed. It already was.");
            return;
        }
        web.navigate("http://www.claremont.se");
        if(web.pageTitleExistWithTimeout("Claremont", 5)){
            web.log(LogLevel.EXECUTED, "Made sure the landing page got displayed.");
        } else {
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not navigate to landing page.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
            web.writeRunningProcessListDeviationsSinceTestCaseStart();
            web.haltFurtherExecution();
        }
    }

    public void ensureContactsPageDisplayed(){
        if(web.driver.getPageSource().contains("KONCERNCHEF OCH VD")){
            web.log(LogLevel.DEBUG, "Made sure the contact page was displayed. It already was.");
            return;
        }
        web.navigate("http://www.claremont.se/kontakt/");
        if(web.driver.getPageSource().contains("KONCERNCHEF OCH VD")){
            web.log(LogLevel.EXECUTED, "Made sure the contact page got displayed.");
        } else {
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not navigate to contact page.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
            web.writeRunningProcessListDeviationsSinceTestCaseStart();
            web.haltFurtherExecution();
        }
    }
}
