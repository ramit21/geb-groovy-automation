import geb.Page


class ReservationPage extends Page {
	static url = "http://localhost:8090/reserve/"
	static at = { title == "Reservations" }
	static content = {
		header {$("h1")}
		nameText {$("input", type:"text" , id : "nameBox")}
		reserveButton {$("input", type:"button" , value : "Reserve")}
		reservationTableAnchor { row, col -> $("tr:nth-child("+ row +") td:nth-child("+ col +")") }
	}
}
