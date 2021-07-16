import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
public class Hangman {
    //final int MAX_WRONG_ANSWERS = 8;
    String easyModeList = "Word_Bank_Easy.txt";
    String MediumModeList = "Word_Bank_Medium.txt";
    String hardModeList = "Word_Bank_Hard.txt";

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Welcome to Hangman");
        System.out.println();
        System.out.println("Please choose a game difficulty:");
        System.out.println("| [1] Easy | [2] Medium | [3] Hard |");
        System.out.print(">>> ");
        int gameMode = inputDevice.nextInt();

        if( gameMode == 1 ){
            System.out.println("You chose, Easy mode.");
        }
        else if( gameMode == 2 ){
            System.out.println("You chose game mode medium.");
        }
        else if( gameMode == 3 ){
            System.out.println("You chose game mode hard.");
        }
        else{
            System.out.println(gameMode+ " is not a proper input. Please try again");
        }
    }

}
