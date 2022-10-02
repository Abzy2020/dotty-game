import java.util.Scanner;

public class App {
    
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        NumberGame numGame = new NumberGame();
        int numOne;
        int numTwo;

        //Choose Player Names
        System.out.println("Player One Name:");
        String playerOne = scnr.nextLine();
        System.out.println("Player Two Name:");
        String playerTwo = scnr.nextLine();
        
        //Choose Player Numbers
        System.out.println("Player one, choose a number:");
        numOne = scnr.nextInt();
        System.out.println("Player two, choose a number:");
        numTwo = scnr.nextInt();
        
        numGame.setPlayerOne(playerOne);
        numGame.setPlayerTwo(playerTwo);
        numGame.setPlayerOneNum(numOne);
        numGame.setPlayerTwoNum(numTwo);
        numGame.menu();
        scnr.close();
    }
}
