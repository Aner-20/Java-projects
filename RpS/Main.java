package RpS;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] items = {"rock", "paper", "scissors"};
        String player = "";
        int numOfRounds = 1;
        int playerPoints = 0;
        int computerPoints = 0;
        while (numOfRounds <= 3) {
            while(!player.toLowerCase().equals("rock") && !player.toLowerCase().equals("paper") && !player.toLowerCase().equals("scissors") &&
            (playerPoints != 2 || computerPoints != 2)){
                System.out.println("Round " + numOfRounds);
                System.out.println("Rock, paper or scissors?");
                player = scanner.nextLine();
            }
            int randomItem = random.nextInt(items.length);
            String computer = items[randomItem];
            
                switch(player.toLowerCase()){
                    case "rock":
                        if(computer.toLowerCase().equals("rock")){
                            System.out.println(computer);
                            numOfRounds++;
                            

                            System.out.println("Tie");
                        }
        
                        else if(computer.toLowerCase().equals("paper")){
                            System.out.println(computer);
                            numOfRounds++;
                            computerPoints++;
    
                            System.out.println("You lose the round");
                        }
        
                        else if(computer.toLowerCase().equals("scissors")){
                            System.out.println(computer);
                            numOfRounds++;
                            playerPoints++;
    
                            System.out.println("You win the round");
                        }
                        break;
                    case "paper":
                    if(computer.toLowerCase().equals("paper")){
                        System.out.println(computer);
                        numOfRounds++;
                        
    
                        System.out.println("Tie");
                    }
        
                    else if(computer.toLowerCase().equals("scissors")){
                        System.out.println(computer);
                        numOfRounds++;
                        computerPoints++;
    
                        System.out.println("You lose the round");
                    }
        
                    else if(computer.toLowerCase().equals("rock")){
                        System.out.println(computer);
                        numOfRounds++;
                        playerPoints++;
    
                        System.out.println("You win the round");
                    }
                    break; 
                    case "scissors":
                    if(computer.toLowerCase().equals("scissors")){
                        System.out.println(computer);
                        numOfRounds++;
                       
    
                        System.out.println("Tie");
                    }
        
                    else if(computer.toLowerCase().equals("rock")){
                        System.out.println(computer);
                        numOfRounds++;
                        computerPoints++;
    
                        System.out.println("You lose the round");
                    }
        
                    else if(computer.toLowerCase().equals("paper")){
                        System.out.println(computer);
                        numOfRounds++;
                        playerPoints++;

                        System.out.println("You win the round");
                    }
                    break; 
            }
        }
    }
}
