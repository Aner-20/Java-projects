import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingContainer;

public class main{

    public static void main(String[] args){
       
    

        // A way to pick random item inside an array
        /*
        String[] items = {"Key", "Pc", "Spoon", "Fork", "Knife"};
        int randomIt = random.nextInt(items.length);
        System.out.println(items[randomIt]);
        */

        pickCharacter();
    }

     static void pickCharacter(){
        Scanner scanner = new Scanner(System.in);
        Player player;
        int choice = 0;

        while(choice < 1 || choice > 2){
            System.out.println("What player do you pick up?");
            System.out.println("1: Player 1\n2: Player 2");
            try{
                choice = Integer.parseInt(scanner.next());  // is foundational to prevent a bug
            }
            catch(Exception e){
                System.out.println("Please enter 1 or 2!");
            }

        }
        
        if(choice == 1){
            player = new Player("Jack", 4, 5, 9, 6);
            System.out.println("Player's name: " + player.name);
            System.out.println("Player's strength: " + player.strength);
            System.out.println("Player's agility: " + player.agility);
            System.out.println("Player's intelligence: " + player.intelligence);
            System.out.println("Player's luck: " + player.luck);
            startGame(player.strength, player.agility, player.intelligence, player.luck);
        }

        else if(choice == 2){
            player = new Player("John", 9, 7, 4, 2);
            System.out.println("Player's name: " + player.name);
            System.out.println("Player's strength: " + player.strength);
            System.out.println("Player's agility: " + player.agility);
            System.out.println("Player's intelligence: " + player.intelligence);
            System.out.println("Player's luck: " + player.luck);

            startGame(player.strength, player.agility, player.intelligence, player.agility);
        }
        
    }

     static void startGame(int strength, int agility, int intelligence, int luck){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("You are in front of a bridge.\nOver this latter there someone with a sword.");
        System.out.println("You are unarmed.\nHowever, behind there is a patchy path that leads to a pine forest");
        System.out.println("What's your choice?\nCross the bridge: (type bridge) or take the path: (type path)");
        String option = "";
        while (!option.toLowerCase().equals("bridge") && !option.toLowerCase().equals("path") ){
            System.out.println("Choice(bridge/path): ");
            option = scanner2.nextLine();
                      
        }
        if(option.toLowerCase().equals("bridge")){
            //System.out.println("Good");
            System.out.println("Strength: " +  strength);
            System.out.println("That figure turns out to be a raider. He is quite powerful");
            System.out.println("You can't come back. You have to face him");
            if(strength >= 8){
                System.out.println("You managed to defeat him. You are able to proceed");
                System.out.println("You stumble upon a rickety house. You decided to get into it.");
                System.out.println("Inside it, you noticed a shiny chest. You decided to open it");


                String playerItem;
                ArrayList<String> tools = new ArrayList<String>();
                tools.add("sword");
                tools.add("axe");
                tools.add("shield");
                tools.add("key");

                // A way to pick random item inside an arrayList
                Random random = new Random();
                int randomItem = random.nextInt(tools.size());
                String randomElement =  tools.get(randomItem);

                playerItem = randomElement;
                System.out.println("Here's what you got: " + playerItem);


                switch(playerItem){
                    case "sword":
                        System.out.println("This might useful to kill eventual enemies");
                        break;

                    case "axe":
                        System.out.println("Maybe somewhere you might cut something");
                        break;

                    case "shield":
                        System.out.println("Awesome! This it will come in handy");
                        break;

                    case "key":
                        System.out.println("It will definitely open some kind of door");
                        break;

                }

                System.out.println("After obtaining the" + playerItem + " you get out of house and spot a great castle. You arrive nearby it, but the entrace is locked.");
                if(playerItem.equals("key")){
                    System.out.println("Luckily for you this key opens the castle's door");
                }

                else{
                    System.out.println("You have to find another way to gain access to the castle");


                    switch (playerItem) {
                        case "axe":
                            System.out.println("You notice a trapdoor. You cut it and decide to explore the underground");
                            break;
                        
                        case "sword":
                            System.out.println("You run into a bandit camp. You overpower all the raiders and figure out that there is a secret entrance to the castle");
                            break;

                        case "shield":
                            System.out.println("You take a better look at the shield and notice a sketched map: a cave next to the castle");
                            break;
                        default:    
                            break;
                    }
                }


            }
            else{
                System.out.println("The raider murders you");
                resetGame();
            }
        }
        else if(option.equals("path")){
            //System.out.println("Ok1");
        } 
    }

    public static void resetGame(){
        Scanner scanner3 = new Scanner(System.in);
        String pick = "";
        System.out.println("Do you want to play again (yes/anything else)?");
        pick = scanner3.nextLine();
        if(pick.toLowerCase().equals("yes")){
            pickCharacter();
        }
        else{
            System.out.println("Thanks for playing!!");
        }
    }

}