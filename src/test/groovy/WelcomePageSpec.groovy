import AbstractGebSpec
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import spec.AbstractGebSpec.*
import spock.lang.Stepwise

@Stepwise
class WelcomePageSpec extends AbstractGebSpec{

	def "Welcome page test"() {
		
		when: "Base url of the application is hit"
			to WelcomePage
 
		then: "Welcome page is opened"
			waitFor{ header }.text().equals("Welcome to spring boot")
			reservationLink.text().equals("Book a reservation")
 
		when: "Reservation link is clicked"
			println "clicking link ..."
			//reservationLink.click();  not working for some reason
			
			WebElement element = driver.findElement(By.id("reserve"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		
		then: "Reservation page is opened"
			waitFor{ $("h1") }.text().equals("Calling Spring boot controllers via ajax")
		
	}
}
