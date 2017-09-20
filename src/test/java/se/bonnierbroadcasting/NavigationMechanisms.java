package se.bonnierbroadcasting;

import bonnierbroadcasting.sitedescription.TV4PlayLandingPage;
import bonnierbroadcasting.sitedescription.TV4PlayNewsPage;
import bonnierbroadcasting.sitedescription.TV4PlayProgramsPage;
import se.claremont.autotest.common.logging.LogLevel;
import se.claremont.autotest.websupport.webdrivergluecode.WebInteractionMethods;

/**
 * Created by jordam on 2017-04-01.
 */
public class NavigationMechanisms {
    WebInteractionMethods web;

    public NavigationMechanisms(WebInteractionMethods web){
        this.web = web;
    }

    public void ensureOnLandingPage(){
        if(web.pageTitleExistWithTimeout("tv4.se", 0)){
            web.log(LogLevel.EXECUTED, "Made sure Landing page visible. It already was.");
            return;
        }
        web.navigate("http://www.tv4.se");
        if(!web.pageTitleExistWithTimeout("tv4.se", 15)){
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not navigate to landing page.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
        } else {
            web.log(LogLevel.EXECUTED, "Made sure Landing page visible.");
        }
    }

    public void ensureOnTv4Play() {
        if(web.pageTitleExistWithTimeout("TV4 Play - Streama dina favoritprogram när du vill", 0)){
            web.log(LogLevel.EXECUTED, "Made sure TV4 Play landing page visible. It already was.");
            return;
        }
        web.navigate("http://www.tv4play.se");
        if(!web.pageTitleExistWithTimeout("TV4 Play - Streama dina favoritprogram när du vill", 15)){
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not navigate to TV4 Play landing page.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
        } else {
            web.log(LogLevel.EXECUTED, "Made sure TV4 Play landing page visible.");
        }
    }

    public void ensureOnProgramsPage(){
        if(web.exists(TV4PlayProgramsPage.nyheternaLink())){
            web.log(LogLevel.EXECUTED, "Made sure the TV4 streaming news page was visible. It already was.");
            return;
        }
        ensureOnTv4Play();
        web.click(TV4PlayLandingPage.menuLinkProgram());
        if(web.existsWithTimeout(TV4PlayProgramsPage.nyheternaLink(), 10)){
            web.log(LogLevel.EXECUTED, "Made sure TV4 streaming news page was at hand.");
        } else {
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not make sure TV4 streaming news page was visible.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
        }
    }

    public void ensureOnNewsStreamPage() {
        if(web.exists(TV4PlayNewsPage.newsPlayer())){
            web.log(LogLevel.EXECUTED, "Made sure the TV4 streaming news page was visible. It already was.");
            return;
        }
        ensureOnProgramsPage();
        web.click(TV4PlayProgramsPage.nyheternaLink());
        web.waitForElementToAppear(TV4PlayNewsPage.newsPlayer(), 10);
        if(web.existsWithTimeout(TV4PlayNewsPage.newsPlayer(), 2)){
            web.log(LogLevel.EXECUTED, "Made sure TV4 streaming news page was at hand.");
        } else {
            web.log(LogLevel.EXECUTION_PROBLEM, "Could not make sure TV4 streaming news page was visible.");
            web.saveScreenshot(null);
            web.saveDesktopScreenshot();
            web.saveHtmlContentOfCurrentPage();
        }
    }
}
