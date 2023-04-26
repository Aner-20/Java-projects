package anotherPwdGenerator;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = upperCaseLetters.toLowerCase();
        String digits = "0123456789";
        String symbols = "!£$%&/()=[]{}@#-_-+*|,;.:§°^?";
        String sum = upperCaseLetters + lowerCaseLetters + digits + symbols;


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantity? ");
        int quantity = scanner.nextInt();
        System.out.println("Length? ");
        int length = scanner.nextInt();
        scanner.nextLine();

        char[] password = new char[length];
        password[0] = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
        password[1] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = symbols.charAt(random.nextInt(symbols.length()));

        
        for(int i = 0; i < quantity; i++){
            for(int j = 0; j < length; j++){
                password[j] = sum.charAt(random.nextInt(sum.length()));
            }
            System.out.println(password);
        }    

    }
}
