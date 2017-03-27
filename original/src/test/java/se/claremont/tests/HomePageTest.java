package se.claremont.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import se.claremont.autotest.common.testrun.Settings;
import se.claremont.autotest.common.testrun.TestRun;
import se.claremont.autotest.common.testset.TestSet;


/**
 * When running these tests logs will be compiled to HTML and plain text and
 * stored in a folder called TAF in your user home directory.
 *
 * The tests open the Claremont home page and performs a few verifications.
 *
 * Feel free to explore test run settings (TestRun.setSettingsValue), the
 * command line interface, logging possibilities (there are currently three
 * test case report types (Plain text, console output, and HTML report),
 * that can be combined.
 *
 * There are also five types of test run reports:
 *  > Console output
 *  > HTML test run summary file report
 *  > Emailed html report
 *  > TAF Backend Server integration
 *  > propagation of test results to Testlink open source test management system.
 *
 * Technologies supported includes:
 *  > Web (with Selenium supported browsers)
 *  > REST (with both JSON and XML)
 *  > Java (through jar files or Java Web Start)
 *
 *  Test levels supported are:
 *  > System testing or system integration testing (with class extension TestSet)
 *  > Unit testing (with class extension UnitTestClass)
 *
 */
public class HomePageTest extends TestSet {
    private TestActions app;

    @BeforeClass
    public static void classSetup() {
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_REPORT_RECIPIENTS_COMMA_SEPARATED_LIST_OF_ADDRESSES, "no.no@no.no");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SERVER_ADDRESS, "smtp.google.com");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SENDER_ADDRESS, "mailrelay@gmail.com");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SERVER_PORT, "25");
        TestRun.setSettingsValue(Settings.SettingParameters.EMAIL_SMTP_OR_GMAIL, "SMTP");

        //Base log folder is a TAF folder under user home folder
        //TestRun.setSettingsValue(Settings.SettingParameters.BASE_LOG_FOLDER, "C:\\TEMP\\");
        //TestRun.setSettingsValue(Settings.SettingParameters.URL_TO_TAF_BACKEND, "http://127.0.0.1:81/taf");
        //TestRun.setSettingsValue(Settings.SettingParameters.URL_TO_TESTLINK_ADAPTER, "http://127.0.0.1:2222/taftestlinkadapter");
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

        //The command below send the current HTML source of the web page for validation with W3C
        //app.checkLandingPageWithW3CValidator();

        //The command below identifies all links on current web page, and report any broken links.
        //app.web.reportBrokenLinks();
    }


}
