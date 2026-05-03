public class Main{
    public static void(String[] args){

        // ROCK PAPER SCISSORS GAME

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do{
            // GET CHOICE FROM THE USER
        System.out.println("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine()toLowerCase();

        if(!playerChoice.equals("rock") && 
           !playerChoice.equals("paper") && 
           !playerChoice.equals("scissors")){
        System.out.print("Invalid choice");
        continue;
        }

        // GET RANDOM CHOICE FOR THE COMPUTER
        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer choice " + computerChoice);
        
        // CHECK WIN CONDITIONS
        if(playerChoice.equals(computerChoice)){
            System.out.println("It's a tie!");
        }
        else if(playerChoicen.equals("rock") && computerChoice.equals(scissors) || 
                playerChoice.equals("paper") && computerChoice.equals("scissors") || 
                playerChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }

        // ASK TO PLAY AGAIN
        System.out.println("Do you want to play again (yes/no)?: ");
        playAgain = scanner.nextLie().toLowerCase();

        

        scannner.close(); 
        } while(playAgain.equals("yes"));
        
        // GOODBYE MESSAGE
        System.out.println("Thank you for playing!")
    }
}