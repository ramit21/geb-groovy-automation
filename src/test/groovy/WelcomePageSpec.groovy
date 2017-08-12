import AbstractGebSpec
import spec.AbstractGebSpec.*
import spock.lang.Stepwise

@Stepwise
class WelcomePageSpec extends AbstractGebSpec{

	def "Welcome page test"() {
		when: "Welcome page is opened"
			to WelcomePage
 
		then:
			1==1
 
	
	}
}
