import java.util.Scanner;
public class Hangman {
    private static String[] wordBank = {"terminator", "Baby", "Hello", "Tent", "banana"};
    private static String randomWord = wordBank[(int) (Math.random() * wordBank.length)];
    private static int wrongGuesses = 0;
    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);
        int wordLength = randomWord.length();
        char[] wordToGuessChars = randomWord.toCharArray();
        char[] censor = randomWord.toCharArray();

        //Hangman game introduction
        System.out.println("——————————————————————————————————————————————");
        drawHangman();
        System.out.println("——————————————————————————————————————————————");

        gameDifficulty(inputDevice);

        System.out.println("——————————————————————————————————————————————");

        System.out.println("Your mystery word is:");
        System.out.println(randomWord);

        for (int i = 0; i < wordLength; i++) {
            censor[i] = '_';
        }

        for (int j = 0; j < wordLength; j++) {
            System.out.print(censor[j] + " ");
        }
        System.out.println();

        System.out.println("Guess a letter");
        System.out.print(">>> ");
        char playerGuess = inputDevice.next().toLowerCase().substring(0, 1).charAt(0);

    }

    public static void gameDifficulty(Scanner inputDevice){
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
    }

    public static void drawHangman(){
        //Beginning drawing, Start Game.
        if( wrongGuesses == 0 ){
            System.out.println("Welcome to Hangman");
            System.out.println("——————————————————");
            System.out.println("     +------+");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #1
        if( wrongGuesses == 1 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #2
        if( wrongGuesses == 2 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #3
        if( wrongGuesses == 3 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |      |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #4
        if( wrongGuesses == 4 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #5
        if( wrongGuesses == 5 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #6
        if( wrongGuesses == 6 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |      │");
            System.out.println("     |");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #7
        if( wrongGuesses == 7 ){
            System.out.println("Wrong guess, please guess a new letter.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (Ӧ)");
            System.out.println("     |     /|\\");
            System.out.println("     |      |");
            System.out.println("     |     /");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }

        //Wrong guess #8, Game over.
        if( wrongGuesses == 8 ){
            System.out.println("Wrong guess, Game Over.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (X)");
            System.out.println("     |     /|\\");
            System.out.println("     |      |");
            System.out.println("     |     / \\");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }
    }
}
