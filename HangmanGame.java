import java.util.Scanner;

public class HangmanGame
{
    private String word = "";       // holds the word to be guessed
    private String progress = "";   // holds the progress string, a mix of letters and blanks
    private String guessed = "";    // holds the list of letters that have been guessed already
    private int missesLeft = 6;     // the number of misses left before losing.
    
    /*
     * This constructor is called when the game is created.
     * 
     * theWord receives the value of the word that is to be guessed. (you should store that in an instance variable)
     * 
     * To Do:
     *        Create the progress string
     *        All of the letters need to be converted to "_". Numbers, spaces, or punctuation should be left where they are.
     *        Example: if theWordord is "fun time" the initial progress string would be "___ ____"
     *        Example: if theWord is "can't win" the initial progress string would be "___'_ ___"
     */
    public HangmanGame( String theWord )
    {
        
    }
    
    /**
     * Draw the current state of the gallows.
     * 
     * TODO: The final set of gallows are drawn for you.  Add all of the rest of the states the gallows can be in.
     */
    public void drawGallows()
    {
        // add the missing states here.
        
        if( missesLeft == 0 )
        {
            System.out.println("  +---+  \n" +
                               "  |   |  \n" +
                               "  O   |  \n" +
                               " /|\\  |  \n" +
                               " / \\  |  \n" +
                               "      |  \n" +
                               "=========\n");
        }
    }
    
    /*
     * Here is where the gameplay happens.
     * 
     * In the main loop you will
     *      - print the current progress
     *      - print the number of chances left
     *      - print a prompt and read the next letter as from input
     *      - add the guess to the list of guesses
     *      - check and see if the letter is in the word and respond appropriately
     *      - update the number of chances left, if necessary
     *      - update the progress string based on the guessed letter
     * 
     * At some point in this method you should check and see if the player has won.
     * If they have won print a congratulatory message.
     */
    public void play()
    {
        Scanner keyboard = new Scanner( System.in );
        while( !isWinner() )
        {
            
        }
    }
    
    // update the progress string with the results of the latest guess
    public void updateProgress( char guess )
    {
        
    }
    
    // print the player's progress in guessing the word.
    // Example output (the word is computer) - "___pu__r"
    public void printProgress()
    {
        
    }
    
    // return true if they have guessed the word, false if they have not guessed the word
    public boolean isWinner()
    {
        
    }
}
