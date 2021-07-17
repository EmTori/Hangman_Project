import java.util.Scanner;
import java.util.Random;

public class Hangman {
    //final int MAX_WRONG_ANSWERS = 8;
    //private static String easyModeList = "Word_Bank_Easy.txt";
    //private static String MediumModeList = "Word_Bank_Medium.txt";
    //private static String hardModeList = "Word_Bank_Hard.txt";
    private static String[] wordBank = {"Cat", "Baby", "Cow", "Dirt", "Dog", "Fear", "Sun", "You", "Art", "Sea", "Joy", "Team", "Book", "Week", "Heart"};
    private static int count = 0;

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        Random random = new Random();

        //Hangman game introduction
        drawHangman();
        System.out.println("——————————————————————————————————————————————");

        System.out.println("Please choose a game difficulty:");
        System.out.println("| [1] Easy | [2] Medium | [3] Hard |");
        System.out.print(">>> ");
        int gameMode = inputDevice.nextInt();

        if( gameMode == 1 ){
            System.out.println("You chose... Easy Difficulty.");
        }
        else if( gameMode == 2 ){
            System.out.println("You chose... Medium Difficulty.");
        }
        else if( gameMode == 3 ){
            System.out.println("You chose... Hard Difficulty.");
        }
        else{
            System.out.println(gameMode+ " is not a proper input. Please try again");
        }
        System.out.println("——————————————————————————————————————————————");

        //Picks random word from word bank
        String word = wordBank[random.nextInt(wordBank.length)];
        System.out.println("Your mystery word is:");
        int wordLength = word.length();
        System.out.println(word);                                    //Tests to see what the word is so I can see if the loop below works properly
        //For loop to print letters of word using "_"
        for(int i = 0; i < wordLength; i++)
            System.out.print("_ ");
        System.out.println();

        //Test how all hangman figures look
        /*for(int i = 0; i < 8; i++){
            count++;
            drawHangman();
        }*/




    }

    public static void drawHangman(){
        //Beginning drawing, Start Game.
        if( count == 0 ){
            System.out.println("Welcome to Hangman");
            System.out.println("     +------+");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #1
        if( count == 1 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #2
        if( count == 2 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (ӧ)");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #3
        if( count == 3 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (ӧ)");
            System.out.println("     |      |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #4
        if( count == 4 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (ӧ)");
            System.out.println("     |     /|");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #5
        if( count == 5 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #6
        if( count == 6 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |      |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #7
        if( count == 7 ){
            System.out.println("Wrong guess, try again.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |      |");
            System.out.println("     |     /");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }

        //Wrong guess #8, Game over.
        if( count == 8 ){
            System.out.println("Wrong guess, Game Over.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (X)");
            System.out.println("     |     /|\\");
            System.out.println("     |      |");
            System.out.println("     |     / \\");
            System.out.println("    _|_");
            System.out.println(" ==/=|=\\========");
        }
    }
}
