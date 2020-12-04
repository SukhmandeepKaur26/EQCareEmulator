import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class test {

	public static void main(String[] args) throws MalformedURLException {
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Android_1 "); //SDK built for x86
		caps.setCapability("udid", "emulator-5554"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("automationName", "UiAutomator2");
		caps.setCapability("noReset", true);
		caps.setCapability("uiautomator2ServerLaunchTimeout", "5000");
		
		/*
		 * DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "iOS");
    capabilities.setCapability(CapabilityType.VERSION, "8.1");
    capabilities.setCapability(CapabilityType.PLATFORM, "Mac");
    capabilities.setCapability("device", "iPhone");
    capabilities.setCapability("browserName", "Chrome");
    driver = new RemoteWebDriver(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);*/
	
		//Set ChromeDriver location
		System.setProperty("webdriver.chrome.driver","/EQCareMobile/drivers/chromedriver.exe");

		//Instantiate Appium Driver
		AppiumDriver<MobileElement> driver = null;
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
				
		//Open URL in Chrome Browser
		driver.get("http://www.google.com");
		}	
	}
		
		



