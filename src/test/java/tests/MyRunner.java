package tests;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/myfeature.feature", 
                 glue="gluecode",
                 plugin={"pretty","html:target/myresults"},
                 monochrome=true)
public class MyRunner extends AbstractTestNGCucumberTests
{
}
