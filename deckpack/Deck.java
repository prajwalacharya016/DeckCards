package deckpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private Cards [] deck = new Cards[52];

	public Cards[] getDeck() {
		return deck;
	}
	
	public Cards[] getColor(String color)
	{
		Cards [] coloredCard = new Cards[26];
		int j=0;
		for (int i=0; i<52; i++)
		{
			if(deck[i].getColor().equals(color))
				coloredCard[j]=deck[i];
		}
		
		return coloredCard;
	}
	
	public Cards[] getType(String type)
	{
		Cards [] typedCard = new Cards[13];
		int j=0;
		for (int i=0; i<52; i++)
		{
			if(deck[i].getType().equals(type))
				typedCard[j]=deck[i];
		}
		
		return typedCard;
	}
	
	public void shuffle()
	{
		List<Cards> solution = new ArrayList<>();
		for (int i = 1; i <= 52; i++) {
		    solution.add(deck[i]);
		}
		Collections.shuffle(solution);
		
		for(int i=0; i<=52; i++)
		{
			deck[i]=solution.get(i);
		}
		
	}
}
