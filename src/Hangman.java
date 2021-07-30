import java.io.FileNotFoundException;
import java.lang.constant.Constable;
import java.util.Scanner; // Import the Scanner class to read text files
public class Hangman {
    //private static String[] wordBank = {"terminator", "Baby", "Hello", "Tent", "banana"};
    //private static String randomWord = wordBank[(int) (Math.random() * wordBank.length)];
    private static int wrongGuesses = 0;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputDevice = new Scanner(System.in);

        //Hangman game introduction
        System.out.println("——————————————————————————————————————————————");
        drawHangman();
        System.out.println("——————————————————————————————————————————————");

        String randomWord = (String) gameDifficulty(inputDevice);
        int wordLength = randomWord.length();
        char[] wordToGuessChars = randomWord.toCharArray();
        char[] censor = randomWord.toCharArray();

        //gameDifficulty(inputDevice);

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

    public static Constable gameDifficulty(Scanner inputDevice) throws FileNotFoundException {
        System.out.println("Please choose a game difficulty:");
        System.out.println("| [1] Easy | [2] Medium | [3] Hard |");
        System.out.print(">>> ");
        int gameMode = inputDevice.nextInt();

        while( gameMode != 1 || gameMode != 2 || gameMode != 3 ){
            if( gameMode == 1 ){
                System.out.println("You chose... Easy Difficulty.");
                String[] wordBank = {"Cat", "Able", "Acid", "Baby", "Cow", "Dirt", "Dog", "Fear", "Meat", "Sun", "You", "Water", "Art", "Lost", "Cold", "Warm", "King", "Sea", "Joy", "Team", "Green", "Book", "Week", "Star", "Heart", "Worm", "Year", "Wind", "Rat", "Dead"};
                String randomWord = wordBank[(int) (Math.random() * wordBank.length)];
                return randomWord;
            }
            else if( gameMode == 2 ){
                System.out.println("You chose... Medium Difficulty.");
                String[] wordBank = {"Normal", "Because", "Weather", "Tomorrow", "Together", "School", "Respect", "Public", "Needle", "Animal", "Beautiful", "Detail", "Event", "Garden",
                        "Meeting", "Example", "Feather", "Glove", "Hammer", "Level", "Agree", "World", "Relief", "Theater", "Medical", "Sugar", "Potato", "Round", "Public", "Leave"};
                String randomWord = wordBank[(int) (Math.random() * wordBank.length)];
                return randomWord;
            }
            else if( gameMode == 3 ){
                System.out.println("You chose... Hard Difficulty.");
                String[] wordBank = {"Subway", "Abyss", "Transcript", "Microwave", "Blizzard", "Stronghold", "Joking", "Dwarves", "Klutz", "Squawk", "Youthful", "Zodiac", "Government", "Harmony", "Structure", "Nymph", "Vaporize",
                        "Mnemonic", "Pixel", "Wizard", "Advertisement", "Competition", "Observation", "Jigsaw", "Representative", "Fashionable", "Amusement", "Adjustment", "Bandwagon", "Wyvern"};
                String randomWord = wordBank[(int) (Math.random() * wordBank.length)];
                return randomWord;
            }
            else{
                System.out.println(gameMode+ " is not a proper input. Please try again.");
                System.out.println("——————————————————————————————————————————————");
                System.out.println("Please choose a game difficulty:");
                System.out.println("| [1] Easy | [2] Medium | [3] Hard |");
                System.out.print(">>> ");
                gameMode = inputDevice.nextInt();
                continue;
            }
        }
        return null;
    }

    public static void drawHangman(){
        //Beginning drawing, Start Game.
        if( wrongGuesses == 0 ){
            System.out.println("Welcome to Hangman");
            System.out.println("——————————————————");
            System.out.println();
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
            System.out.println();
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
            System.out.println("Wrong guess.");
            System.out.println();
            System.out.println("     +------+");
            System.out.println("     |      |");
            System.out.println("     |     (X)             GAME OVER  ");
            System.out.println("     |     /|\\            ———————————");
            System.out.println("     |      |");
            System.out.println("     |     / \\");
            System.out.println("    _|_");
            System.out.println(" ==/=│=\\========");
        }
    }
}
