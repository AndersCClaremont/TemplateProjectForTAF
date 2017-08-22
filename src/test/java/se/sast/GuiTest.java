package se.sast;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.claremont.autotest.common.support.tableverification.CellMatchingType;
import se.claremont.autotest.common.testrun.Settings;
import se.claremont.autotest.common.testrun.TestRun;
import se.claremont.autotest.common.testset.TestSet;
import se.claremont.autotest.websupport.webdrivergluecode.WebInteractionMethods;

/**
 * Demo for Swedish TV4, also used for educational purposes
 *
 * Created by jordam on 2017-04-01.
 */
public class GuiTest extends TestSet {
    WebInteractionMethods web;

    @BeforeClass
    public static void classSetup(){
        TestRun.setSettingsValue(Settings.SettingParameters.PATH_TO_LOGO, "http://sast.se/images/sast_logo3.gif");
    }

    @Before
    public void setup(){
        web = new WebInteractionMethods(currentTestCase);
    }

    @After
    public void teardown(){
        if(web == null)return;
        web.makeSureDriverIsClosed();
    }

    @Test
    public void landingPageTestAddQ(){
        web.navigate("http://www.sast.se");
        web.click(LandingPage.qMoten_Link());
        web.click(QMotenPage._20170427Q2whatsInFrontPlusArsmote_Link());
        web.verifyTableRow(Q2_2017Page.box_Table(), "Programpunkt:AddQ", CellMatchingType.CONTAINS_MATCH);
    }

    @Test
    public void landingPageTestAtTen(){
        web.navigate("http://www.sast.se");
        web.click(LandingPage.qMoten_Link());
        web.click(QMotenPage._20170427Q2whatsInFrontPlusArsmote_Link());
        web.verifyTableRow(Q2_2017Page.box_Table(), "Programpunkt:Claremont;Tid:10", CellMatchingType.CONTAINS_MATCH);
    }


    @Test
    public void landingPageTestAtFiftenn(){
        web.navigate("http://www.sast.se");
        web.click(LandingPage.qMoten_Link());
        web.click(QMotenPage._20170427Q2whatsInFrontPlusArsmote_Link());
        web.verifyTableRow(Q2_2017Page.box_Table(), "Programpunkt:Claremont;Tid:15", CellMatchingType.CONTAINS_MATCH);
    }

    @Test
    public void newPageCodeGenerator(){
        web.navigate("http://www.sast.se");
        web.mapCurrentPage("C:\\temp\\landingpageQuick.txt");
    }

    @Test
    public void brokenLinkCheck(){
        web.navigate("http://www.sast.se");
        web.reportBrokenLinksOnCurrentPage();
    }

    @Test
    public void w3CCheck(){
        web.navigate("http://www.sast.se");
        web.verifyCurrentPageSourceWithW3validator(false);
    }
}
