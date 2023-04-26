package pwdGenerator;
import java.util.Random;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args){
        Random random = new Random();
        int length = 10;
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = upperCaseLetters.toLowerCase();
        String digits = "0123456789";
        String symbols = "!£$%&/()=[]{}@#-_-+*|,;.:§°^?";
        String sum = upperCaseLetters + lowerCaseLetters + digits + symbols;

        char[] password = new char[length];
        password[0] = upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length()));
        password[1] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[2] = digits.charAt(random.nextInt(digits.length()));
        password[3] = symbols.charAt(random.nextInt(symbols.length()));

        for(int i = 0; i < length; i++){
            password[i] = sum.charAt(random.nextInt(sum.length()));
            //System.out.println(password);
        }
        System.out.println(password);
        
        

    }
}
