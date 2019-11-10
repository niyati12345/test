package GoogleTask;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//plugin = {"pretty","html:target/Destination"}
@CucumberOptions(features = ".",tags = "@search")
public class RunTest {
}
