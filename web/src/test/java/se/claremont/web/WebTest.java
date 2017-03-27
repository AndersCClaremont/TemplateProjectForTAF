package se.claremont.web;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import se.claremont.autotest.common.testrun.Settings;
import se.claremont.autotest.common.testrun.TestRun;
import se.claremont.autotest.common.testset.TestSet;
import se.claremont.web.support.TestActions;


@RunWith(SpringRunner.class)
@SpringBootTest(
        classes = Application.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebTest extends TestSet {
    @LocalServerPort
    private int port;
    private TestActions app;


    @Before
    public void setup() {
        app = new TestActions(currentTestCase);
        name = this.getClass().getSimpleName();
    }

    @Test
    public void test_get_hellopage() {
        app.getWeb().navigate("http://localhost:" + port + "/hello");
        app.getWeb().verifyPageTitle("Hello world");
        //app.getWeb().verifyCurrentPageSourceWithW3validator(true);
    }

    @Test
    public void test_get_wrong_page() {
        app.getWeb().navigate("http://localhost:" + port + "/wrong");
        app.getWeb().verifyTextExistOnCurrentPage("There was an unexpected error");
        app.getWeb().verifyTextExistOnCurrentPage("404");
    }

    @After
    public void testTearDown(){
        app.getWeb().makeSureDriverIsClosed();
    }

}
