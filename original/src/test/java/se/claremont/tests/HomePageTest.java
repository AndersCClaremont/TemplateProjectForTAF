package se.claremont.tests;

import org.junit.*;
import org.junit.rules.TestName;
import se.claremont.autotest.common.testrun.Settings;
import se.claremont.autotest.common.testrun.TestRun;
import se.claremont.autotest.common.testset.TestSet;


/**
 * Created by jordam on 2016-12-04.
 */
public class HomePageTest extends TestSet {
    private TestActions app;

    @BeforeClass
    public static void classSetup(){
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_REPORT_RECIPIENTS_COMMA_SEPARATED_LIST_OF_ADDRESSES, "no.no@no.no");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SERVER_ADDRESS, "smtp.google.com");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SENDER_ADDRESS, "mailrelay@gmail.com");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SERVER_PORT, "25");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SMTP_OR_GMAIL, "SMTP");
        TestRun.setSettingsValue(Settings.SettingParameters.PATH_TO_LOGO, "http://46.101.193.212/TAF/images/claremontlogo.gif");

        //Base log folder is a TAF folder under user home folder
        //TestRun.setSettingsValue(Settings.SettingParameters.BASE_LOG_FOLDER, "C:\\TEMP\\");
    }

    @Before
    public void testSetup(){
        app = new TestActions(currentTestCase);
    }

    @After
    public void testTearDown(){
        app.web.makeSureDriverIsClosed();
    }

    @Test
    public void landingPageTest(){
        app.nav.ensureLandingPageDisplayed(); //Making sure we're on the landing page

        //Line below is writing element descriptors for landing page to file, to be copy->pasted into page class.
        //app.web.mapCurrentPage("C:\\Temp\\landingpage.txt");

        app.checkLandingPageLinks();
        app.checkLandingPageLayout();
        app.checkLandingPageTexts();
        //app.checkLandingPageWithW3CValidator();
    }


}
