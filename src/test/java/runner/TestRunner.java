    package runner;

    import org.junit.runner.RunWith;

    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/resources/features",
    glue = "steps",
    snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
    monochrome = true,
    dryRun = false
)
public class TestRunner {
    
}

