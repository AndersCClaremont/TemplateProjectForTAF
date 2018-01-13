package se.claremont.tests;

import org.junit.Before;
import org.junit.Test;
import se.claremont.autotest.common.testset.TestSet;
import se.claremont.autotest.restsupport.RestSupport;

public class RestTest extends TestSet{

    RestSupport restSupport ;

    @Before
    public void setup(){
        restSupport = new RestSupport(currentTestCase());
    }


    @Test
    public void myTest(){
        currentTestCase().addTestCaseData("Issuetype", restSupport.responseBodyFromGetRequest("http://www.claremont.se/api/rest"));
    }

}
