/* Este archivo crea la clase carta con los atributos tipo y valor más el método toString*/

package ejercicio2;

public class Card {

	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
