package ie.tudublin;

public class Follow
{
    public String word;
    public int count;

    // initialising variables in the constructor method
    public Follow(String word, int count)
    {
        this.word = word;
        this.count = count;
    }

    // returns word and count variables as a string 
    public String toString()
    {
        return word + count;
    }

    // accessor method getWord() allows other classes to access the value of the word variable
    public String getWord()
    {
        return word;
    }

    // accessor method getCount() allows other classes to access the value of the count variable
    public int getCount()
    {
        return count;
    }
}
