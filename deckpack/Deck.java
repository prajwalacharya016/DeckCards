package deckpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Cards> deck = new ArrayList<Cards>();

	public List<Cards> getDeck() {
		return deck;
	}
	
	public void add(Cards card){
		deck.add(card);
	}
	
	public List<Cards> getColor(String color)
	{
		List<Cards> coloredCard = new ArrayList<Cards>();
		for (int i=0; i<deck.size(); i++)
		{
			if(deck.get(i).getColor().equals(color))
				coloredCard.add(deck.get(i));
		}
		
		return coloredCard;
	}
	
	public List<Cards> getType(String type)
	{
		List<Cards> typedCard = new ArrayList<Cards>();
		for (int i=0; i<deck.size(); i++)
		{
			if(deck.get(i).getType().equals(type))
				typedCard.add(deck.get(i));
		}
		
		return typedCard;
	}
	
	
	public void shuffle()
	{
		Collections.shuffle(deck);
		System.out.println("!!!!Shuffling!!!");
		
	}
	
	void print()
	{
		for (int i=0; i<deck.size(); i++)
			System.out.println(deck.get(i));
	}
}
