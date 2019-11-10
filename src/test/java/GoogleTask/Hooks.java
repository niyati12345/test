package GoogleTask;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {
    BrowserSelector browserSelector=new BrowserSelector();
    LoadProps loadProps=new LoadProps();
    @Before
    public void openBrowser(){
        browserSelector.setUpBrowser();
       // driver.get(loadProps.getProperty("url"));
    }
    @After
    public  void tearDown(){
        driver.quit();
    }
}
