//package stepdefinitions;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import utilities.Driver;
//public class Hooks {
//    //jUnit @Before -> Before each @Test.
////Cucumber @Before -> Before each Scenario. No need to extend Hooks class
//    /*
//     * Hooks has @Before and @After methods
//     * We use hooks for taking screenshots
//     * In our framework, our hooks is taking the screenshots of failed scenarios.
//     * */
//    @Before
//    public void setUp(){
////        System.out.println("This is @Before Method");
//    }
//    @After
//    public void tearDown(Scenario scenario){
////        System.out.println("This is @After Method");
//        /*
//         * This method will take the screenshot IF THE SCENARIO FAILS*/
////        Taking screenshot
//        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
////        Attaching the screenshot to the reports if scenario fails
//        if (scenario.isFailed()){
//            scenario.attach(screenshot,"image/png","ScreenShot ");
//        }
//    }
//}