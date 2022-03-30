package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Login.feature",
        glue = "stepDefinitions",
        monochrome = true,
        tags = "@SmokeTest or @RegTest"
//	  tags = "@Type1"
//        tags = "@SmokeTest"
//        tags = "@RegTest"
//        tags = "@SmokeTest and @RegTest"

)
public class TestRunner {
}
