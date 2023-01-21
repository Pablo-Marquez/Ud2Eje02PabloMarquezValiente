/* Este archivo guarda en 2 arrays los datos de los valores y los datos de los tipos. Genera todo un mazo de cartas y al final baraja el mazo e imprime 5 cartas aleatorias del mazo */

package ejercicio2;


import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {

		String[] suits = { "Spades", "Diamonds", "Club", "Heart" }; //Array que almacena el tipo de las cartas
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };//Array que almacena los valores de las cartas

		ArrayList<Card> deck = new ArrayList<Card>();//Mazo que guarda las cartas

		for (int i = 0; i < suits.length; i++) { //Bucle que genera toda la baraja cartas y la almacena en el mazo
			for (int j = 0; j < values.length; j++) { 
				Card card = new Card(suits[i], values[j]);//Se crea la carta
				deck.add(card);//Se almacena  la carta en el mazo
			}
		}

		for (int i = 0; i < deck.size(); i++) { //Guarda en otra baraja cartas aleatorias del mazo
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}

		for (int i = 0; i < 5; i++) {	//Imprime las 5 primeras cartas de la baraja
			System.out.println(deck.get(i));
		}

	}

}
