import geb.spock.GebSpec
import org.openqa.selenium.chrome.ChromeDriver;

//abstract class to ensure that this is not run as a standalone test case, even though name ends in *Spec
abstract class AbstractGebSpec extends GebSpec { 

	static def cachedDriver // static variable will store our single driver instance
	
	   def setupSpec() {
		   if ( cachedDriver == null) { // in first Specification this will be true
			   cachedDriver = new ChromeDriver() // so let's create driver and put it in cachedDriver variable
		   }
	   }
	
	  def setup() {
		   driver = cachedDriver   // each test should use our cached browser instance
	   }
}
