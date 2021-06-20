package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
This will run the feature files
@RunWith is used to run the java class. This is a Cucumber-JUnit annotation
@CucumberOptions is used to add features, glue, plugins, tags, dryRun. This is a Cucumber-JUnit annotation
-features : points to the path of the features folder
-glue     : points to the path of the step definitions folder
-tag      : this marks which feature files to run.Tags can be given any value
*/
@RunWith(Cucumber.class)//JUnit Similar to @Test annotation in TestNG
@CucumberOptions(
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@room_reservation_1",
        dryRun = false
)
public class Runner {
}