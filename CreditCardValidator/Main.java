package CreditCardValidator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        char characters;

        // Step 1
        System.out.println("Enter a credit card: ");
        String cardNumber = scanner.nextLine();
        int[] cardIntArray = new int[cardNumber.length()];
        cardNumber = cardNumber.replace("-", "");
        cardNumber = cardNumber.replace(" ", "");  // to eliminate any white spaces
        // Reverse a string
        for(int i = 0; i < cardNumber.length(); i++){
            characters = cardNumber.charAt(i); // extracts each character
            //reversedCardNumber = characters + reversedCardNumber;
            cardIntArray[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }

       
        
        // Step 2 add all digits in the odd places from right to left
        for(int i = cardIntArray.length - 2; i >= 0; i = i - 2){
            int number = cardIntArray[i];
            number *= 2; // step 3 double every second digit from right to left
            if (number > 9){ // if result is a two-digit number, add the two-digit number together to get a single digit
                number = number % 10 + 1;
            }
            cardIntArray[i] = number;
        }
        
        // Step 4 sum the totals of steps 2 and 3
        for(int i = 0; i < cardIntArray.length; i++){ 
            total += cardIntArray[i];

        }
        // Step 5 if sum is divisible by 10, the credit card is valid
        if(total % 10 == 0){
            System.out.println(cardNumber + " is a valid credit card number");
        }
        else{
            System.out.println(cardNumber + " is an invalid credit card number");
        }

    }
}
