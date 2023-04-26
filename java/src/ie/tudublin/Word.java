package ie.tudublin;

import java.util.ArrayList;

public class Word {

    public String word;
    ArrayList<Follow> follows = new ArrayList<Follow>();

    // initialising variables in the constructor
    public Word(String word)
    {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    //This function allows other classes to access the value of word variable
    public String getWord()
    {
        return word;
    }

    // returns word and follows variables as a string
    public String toString()
    {
      return word + follows;
    }
}
