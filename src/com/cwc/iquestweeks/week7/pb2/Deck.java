package com.cwc.iquestweeks.week7.pb2;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private static final char SUITES[] = {'♥', '♦', '♣', '♠'};
    private List<Card> cards;

    /**
     * Initializes the cards in the deck with numbers and suites
     */
    public Deck() {
        cards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                if (j < 11)
                    cards.add(new Card(SUITES[i], j));
                else
                    cards.add(new Card(SUITES[i], j + 1));
            }
        }
    }

    /**
     * Prints all the cards in the deck in order of appearance
     */
    public void printDeck()
    {
        for(Card c: cards)
        {
            System.out.print(c.getNumber().toString()+(c.getSuite())+',');
        }
        System.out.println("");
    }

    /**
     * Interchanges the cards in the deck randomly at least 50 times and at most 150 times
     */
    public void shuffle()
    {
        for(int i=0;i<(int)Math.round(Math.random()*100+50);i++)
        {
            int index1=(int)Math.round(Math.random()*52);
            int index2=(int)Math.round(Math.random()*52);
            Card c=cards.get(index1);
            cards.set(index1,cards.get(index2));
            cards.set(index2,c);
        }
    }
}
