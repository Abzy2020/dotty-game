import java.util.Scanner;

public class NumberGame {
    
    Scanner s = new Scanner(System.in);
    private boolean menuRunning = true;
    private boolean running = true;
    private boolean turn = true;
    private String playerOne;
    private String playerTwo;
    private String answer;
    private int numOne;
    private int numTwo;
    private int sum = numOne + numTwo;
    private int guess;

    public void setPlayerOne(String playerOne){
        this.playerOne = playerOne;
    }

    public void setPlayerTwo(String playerTwo){
        this.playerTwo = playerTwo;
    }

    public void setPlayerOneNum(int numOne){
        this.numOne = numOne;
    }

    public void setPlayerTwoNum(int numTwo){
        this.numTwo = numTwo;
    }

    public void startGame(){
        do{
            if (turn == true){ //if the turn is true player one goes
                System.out.println("Guess a sum " + playerOne + ":");
                guess = s.nextInt();
                if (guess == sum){
                    System.out.println(playerOne + " wins!");
                    System.out.println();
                    running = false;
                }else if (guess < numOne){ //Impossible number
                    System.out.println(playerTwo + " wins!");
                    System.out.println();
                    running = false;
                } else{
                    System.out.println("Miss");
                    System.out.println();
                }
            } else{ //if the turn is false player two goes
                System.out.println("Guess a sum " + playerTwo + ":");
                guess = s.nextInt();
                if (guess == sum){
                    System.out.println(playerTwo + " wins!");
                    System.out.println();
                    running = false;
                }else if (guess < numTwo){ //Impossible number
                    System.out.println(playerOne + " wins!");
                    System.out.println();
                    running = false;
                } else{
                    System.out.println("Miss");
                    System.out.println();
                }
            }
            turn = !turn; //switch turns
        }while(running);
    }

    public void menu(){
        do{
            System.out.println("MENU:");
            System.out.println("r - Rules");
            System.out.println("s - Start Game");
            System.out.println("q - Quit Game");
            System.out.println();

            answer = s.nextLine();
            
            if (answer.charAt(0) == 'r'){
                System.out.println("RULES:");
                System.out.println("Each player chooses a number between 1 and 10.");
                System.out.println("Players must guess the sum of their number and their opponents number.");
                System.out.println("Impossible numbers result in an immediate loss for the player that guessed it.");
                System.out.println();
            }
            else if (answer.charAt(0) == 's'){
                System.out.println("Starting game");
                System.out.println();
                startGame();
                menuRunning = false;
            }
            else if (answer.charAt(0) == 'q'){
                System.out.println("Quit game");
                menuRunning = false;
            }
            else{
                System.out.println("Please choose a selection: ");
                System.out.println();
            }

        }while(menuRunning);
    }

}