package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage
{
    LoadProperty loadProperty = new LoadProperty();
    String browserName = loadProperty.getProperty("browser");

    public static final String AUTOMATE_USERNAME = "nisha_DAs9lS";
    public static final String AUTOMATE_ACCESS_KEY = "V3S9iisaoUzy5nALZyCQ";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final boolean browserStack = true;
    DesiredCapabilities caps = new DesiredCapabilities();

    public void openBrowser(){

        if(browserStack) {
            if (browserName.equalsIgnoreCase("chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");
            } else if (browserName.equalsIgnoreCase("safari")) {
                caps.setCapability("os", "OS X");
                caps.setCapability("os_version", "Big Sur");
                caps.setCapability("browser", "Safari");
                caps.setCapability("resolution","1920x1080");
                caps.setCapability("browser_version", "14.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");
            }else if (browserName.equalsIgnoreCase("firefox")){
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");

            }
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        else {
            if (browserName.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/resources/BrowserDriver/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                // initialzing the object
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {

                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
                //initializing the object
                driver = new FirefoxDriver();
            } else {
                System.out.println("Incorrect browser name....." + browserName);

            }
        }

        // maximize the browser window
        driver.manage().window().maximize();
        // applying implicity wait to driver object
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
}
