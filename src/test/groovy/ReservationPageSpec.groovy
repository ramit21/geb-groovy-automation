import AbstractGebSpec
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebElement

import spec.AbstractGebSpec.*
import spock.lang.Stepwise

@Stepwise
class ReservationPageSpec extends AbstractGebSpec{

	def "Reservation page test"() {
		
		when: "Reservation url of the application is hit"
			to ReservationPage
 
		then: "Reservation page is opened"
			waitFor{ header }.text().equals("Calling Spring boot controllers via ajax")
 
		when: "I enter name and click on reserve"
			nameText.value("Modi Modi")
			
			WebElement element = driver.findElement(By.className("addBtn"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			reserveButton.click();
			sleep(2000l)
		
		then: "A new reservation is made"
			reservationTableAnchor(7 ,2).text() == "Modi Modi";
	}
}
