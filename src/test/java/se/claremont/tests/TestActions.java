package se.claremont.tests;

import se.claremont.applicationdescription.NavigationMechanisms;
import se.claremont.applicationdescription.applicationpages.LandingPage;
import se.claremont.autotest.common.testcase.TestCase;
import se.claremont.autotest.websupport.webdrivergluecode.WebInteractionMethods;

/**
 * Created by jordam on 2016-12-04.
 */
public class TestActions {
    private TestCase testCase;
    WebInteractionMethods web;
    NavigationMechanisms nav;

    public TestActions(TestCase testCase){
        this.testCase = testCase;
        web = new WebInteractionMethods(this.testCase);
        nav = new NavigationMechanisms(web);
    }

    public void checkLandingPageLinks() {
        nav.ensureLandingPageDisplayed();
        //web.reportBrokenLinks();
    }

    public void checkLandingPageLayout() {
        nav.ensureLandingPageDisplayed();
        web.verifyObjectIsDisplayed(LandingPage.englishFlag());
    }

    public void checkLandingPageTexts() {
        nav.ensureLandingPageDisplayed();
        web.verifyTextExistOnCurrentPage("När vi ser meningen med de förändringar vi arbetar med");
    }

    public void checkLandingPageWithW3CValidator() {
        nav.ensureLandingPageDisplayed();
        web.verifyCurrentPageSourceWithW3validator(false);
    }
}
