import geb.Page


class WelcomePage extends Page {
	static url = "http://localhost:8090/"
	static at = { title == "Welcome page" }
	static content = {
		header {$("h1")}
	}
}
