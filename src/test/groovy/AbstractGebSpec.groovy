import geb.spock.GebSpec

import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.remote.DesiredCapabilities

//abstract class to ensure that this is not run as a standalone test case, even though name ends in *Spec
abstract class AbstractGebSpec extends GebSpec { 

	static def cachedDriver // static variable will store our single driver instance
	
	   def setupSpec() {
		   if (cachedDriver == null) { 
			  /* System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			   cachedDriver = new ChromeDriver() */
			   DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
			   caps.setCapability("ignoreZoomSetting", true);
			   System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
			   cachedDriver = new InternetExplorerDriver(caps)
			   //cachedDriver.get("http://www.yahoo.com"); this will open yahoo.com as a test
		   }
	   }
	
	  def setup() {
		   driver = cachedDriver   // each test should use our cached browser instance
	   }
	  
}
