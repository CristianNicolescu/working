package com.cwc.iquestweeks.week4.pb3;


public class SentenceGenerator {
    private static final String[] ARTICLES={"the", "a", "one", "some", "any"};
    private static final String[] NOUNS={"boy", "girl", "dog", "town", "car"};
    private static final String[] VERBS={"drove", "jumped", "ran", "walked","skipped"};
    private static final String[] PREPOSITIONS={"to", "from", "over", "under", "on"};

    /**
     * Randomly builds a string from the given arrays in order: article, noun, verb, preposition, article, noun
     * @return String - built randomly from given words
     */
    public String buildSentence()
    {
        StringBuilder stringBuilder=new StringBuilder();
        String tmp=ARTICLES[(int)Math.round(Math.random()*4)];
        stringBuilder.append(tmp.substring(0,1).toUpperCase()+ tmp.substring(1)+" ");
        stringBuilder.append(NOUNS[(int)Math.round(Math.random()*4)]+" ");
        stringBuilder.append(VERBS[(int)Math.round(Math.random()*4)]+" ");
        stringBuilder.append(PREPOSITIONS[(int)Math.round(Math.random()*4)]+" ");
        stringBuilder.append(ARTICLES[(int)Math.round(Math.random()*4)]+" ");
        stringBuilder.append(NOUNS[(int)Math.round(Math.random()*4)]+".");
        return stringBuilder.toString();
    }
}
