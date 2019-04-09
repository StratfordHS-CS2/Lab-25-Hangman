import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 * This class runs the Hangman game.  It will ask the user if they want to enter a word, or read a random word from a file.
 * Then the word will be passed to the Hangman class and the game will begin.
 * 
 * @author Dave Avis
 * @version 4.8.2019
 */
public class HangmanRunner
{
    //private int lines = 0; // total number of lines (words) in the file
    private static final String FILE = "words.txt";  // this file needs to be in the same folder as this class.
    private static String word = "";    // this holds the word that will be guessed
    
    /**
     * The main method where the user chooses how to set the word and calls the Hangman class.
     * 
     * @param args not used
     * @throws IOException if the file cannot be opened
     */
    public static void main( String[] args ) throws IOException
    {
        Scanner keyboard = new Scanner( System.in );
        int choice = -1;
        while( choice != 0 )
        {
            System.out.println( "*** Welcome to Hangman ***" );
            System.out.println( "1. Enter a word or phrase" );
            System.out.println( "2. Computer chooses a word" );
            System.out.println( "0. Quit" );
            System.out.print(   "Choice: " );
            choice = keyboard.nextInt();
            keyboard.nextLine();
            switch( choice ){
                case 1: enterWord(); break;
                case 2: randomWord(); break;
                default: randomWord();
            }
            //System.out.println( "Word is " + word );
            if( choice != 0 )
            {
                HangmanGame h = new HangmanGame( word );
                h.play();
            }
        }
    }
    
    /**
     * Chooses a random word from a file.
     * 
     * @throws IOException if the file cannot be opened
     */
    private static void randomWord() throws IOException
    {
        Scanner s = new Scanner(new File( FILE ) );
        ArrayList<String> list = new ArrayList<String>();
        while( s.hasNextLine() )
        {
            list.add( s.nextLine() );
        }
        s.close();
        
        int spot = (int)(Math.random() * (list.size() -1 ) );
        word = list.get( spot );
        //System.out.println( spot + " " + word );
    }
    
    /**
     * Lets the user enter a word for another user to guess.
     */
    private static void enterWord()
    {
        System.out.print( "Enter a word/phrase: " );
        Scanner keyboard = new Scanner (System.in );
        word = keyboard.nextLine().trim();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n" ); //advancing the screen
        keyboard.close();
    }
}