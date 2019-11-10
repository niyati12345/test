package GoogleTask;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils {
    LoadProps loadProps =new LoadProps();
    public void setUpBrowser()
    {
        String browser=loadProps.getProperty("Browser");
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\resourcees\\BrowserDriver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        System.out.println("Your driver is empty or testdata is incorrect\" + browser");
       // driver.manage().window().fullscreen();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(loadProps.getProperty("url"));
    }

}
