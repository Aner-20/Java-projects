package BankingProgram;

import java.util.Scanner;

import javax.print.attribute.standard.DialogTypeSelection;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main{
   static Scanner scanner = new Scanner(System.in);
   static int balance = 0;
   public static void main(String[] args){
        display();
   }

   public static void display(){
        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("Welcome to your bank account");
            System.out.println("What would you like to do?");
            System.out.println("1) Check your balance");
            System.out.println("2) Deposit");
            System.out.println("3) Withdrawal");
            System.out.println("4) Exit");
            try{
                choice = Integer.parseInt(scanner.next());
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    
                    case 2:
                        deposit();
                        break;

                    case 3:
                        withdraw();
                        break;

                    case 4:
                        exit();
                        break;

                    default:
                        break;
                }
            } catch (Exception e){
                System.out.println("Type 1,2,3 or 4");
            }
        }
   }

   public static void checkBalance(){
        int pick = 0;
        
        while (pick != 4) {
            try{
                System.out.println("Your current balance: " + "$" + balance);
                System.out.println("Press 4 to go back to the menu");
                pick = Integer.parseInt(scanner.next());
                if (pick == 4){
                    display();
                }
            } catch(Exception e){
                System.out.println("You have to press 4 if you wanna go back to the menu");
            }
        }
   }

   public static void deposit(){
        int choice = 0;
        
        while (choice < 1 || choice > 2) {
            System.out.println("Would you like to deposit or back to the menu?");
            try{
                System.out.println("Type 1 or 2: ");
                choice = Integer.parseInt(scanner.next());
                if(choice == 1){
                    store();
                }
                else{
                    display();
                }

            } catch(Exception e){
                System.out.println("You have to type 1 or 2!");
            }
        }
   }

   public static void store(){
        int amount = 0;
        boolean pick = true;
        while(pick == true){
            System.out.println("How much would you like to deposit (or press 0 to go back to the menu)?");

            try{
                amount = Integer.parseInt(scanner.next());
                if(amount > 0){
                    balance += amount;
                    System.out.println("Current balance: " + balance);
                    amount = 0;
                    //System.out.println("Amount: " + amount);
                    
                }
                else if (amount < 0){
                    System.out.println("Insert a positive number");
                }
                
                else if (amount == 0){
                    display();
                }

            } catch(Exception e){
                System.out.println("Please enter a number");
            }
        }
   }




   public static void withdraw(){
        int choice = 0;
        System.out.println("Do you want to withdraw or back to the menu?");
        while(choice != 1 || choice != 2){
            try{
                System.out.println("Type 1 or 2: ");
                choice = Integer.parseInt(scanner.next());
                if(choice == 1){
                    subtract();
                }
                else{
                    display();
                }

            } catch(Exception e){
                System.out.println("You have to type 1 or 2!");
            }
        }
    }

    public static void subtract(){
        int sum = 0;
        boolean pick = true;
        System.out.println("How much would you like to withdraw (or press 0 to go back to the menu)?");
        if (balance > 0){
            while(pick == true){

                try{
                    sum = Integer.parseInt(scanner.next());
                    if(sum > 0 && balance > 0){
                        balance -= sum;
                        System.out.println("Current balance: " + balance);
                        sum = 0;
                        subtract();
                        //System.out.println("Amount: " + sum);
                        
                    }
                    else if (sum < 0){
                        System.out.println("Insert a positive number");
                    }
                    
                    else if (sum == 0){
                        display();
                    }
                     
                    
                } catch(Exception e){
                    System.out.println("Please enter a number");
                }
            }
        }
        else if(balance <= 0){
            System.out.println("Insufficient credit");
            display();
        }
       
    }

   static void exit(){
        System.out.println("Thanks for choosing us!");
   }

}
