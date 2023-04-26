package GuessTheNumber;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Main {
    //static Scanner scanner =  new Scanner(System.in);
    //static Random random = new Random();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minNum = 1; 
        int maxNum = 10;
        String response = "";
        ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);


        while(!response.equals("c")){
            int guess = random.nextInt(numbers.size()) + 1;
            System.out.println("Is" + guess + " too high(h), too low(l) or correct(c)? ");
            response = scanner.nextLine();
            if(response.equals("h") && guess == numbers.get(guess - 1)){
                numbers.remove(guess);
                //maxNum = guess - 1;
                System.out.println(numbers);
            }
            else if(response.equals("l") && guess == numbers.get(guess + 1)){
                //minNum = guess + 1;
                numbers.remove(guess);
                System.out.println(numbers);
            }
            System.out.println("ArrayList: " + numbers);
        }
        System.out.println("The computer guessed the number correctly. ");
    }



    /*
     * 
     * static int randomInt(int minNum, int maxNum){
        return random.nextInt(10) * (maxNum - minNum + 1) + minNum;
    }
     */
    
}
