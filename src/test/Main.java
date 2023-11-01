package test;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("This is an English to Morse and Morse code to English translator");
        System.out.println("ENTER A STRING and when you wish to exit program enter stop or Stop ");

        Scanner scan = new Scanner(System.in);
        String input_line = "";
     
        while (!input_line.equals("stop")) {
            input_line = scan.nextLine();
            input_line = input_line.toLowerCase();

            Morse_translation read_lineMorse_translation = new Morse_translation();
            System.out.println("The translation is:");
            String translatedText = read_lineMorse_translation.Fix_Morse(input_line);
            System.out.println(translatedText);    
        }


        System.out.println("Thank you for using this program");
    }

}
