package QuizGame;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] questions = {"What's my name?", "How old am i?", "Where am i living?"};
    static String[][] answers = {
        {"1) Andrea", "2) Nobody", "3)David", "4)John"},
        {"1) 34","2) 21","3) 22","4) 50"},
        {"1) Naples","2) Turin","3) Milan","4) Rome"},
    };
    static int[] arr = {1,3,4};
    static int correctAnswers = 0;
    static int wrongAnswers = 0;
    static int input = 0;
    

    public static void main(String[] args){
       
        for(int i= 0; i < questions.length; i++){
            System.out.println(questions[i]);
            System.out.println("******");

            for(int j = 0; j <= answers.length; j++ ){
                System.out.println(answers[i][j]);
            }
            System.out.println("1,2,3 or 4?");
            input = scanner.nextInt();
            

            if(input == arr[i]){
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }
        }
    
    }
}
