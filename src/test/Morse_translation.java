package test;
import java.util.HashMap;
import java.util.Scanner;

public class Morse_translation {

    private HashMap<String, String> morse = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    public Morse_translation() {
// Translation English to Morse

        morse.put("a", ".- ");
        morse.put("b", "-... ");
        morse.put("c", "-.-. ");
        morse.put("d", "-.. ");
        morse.put("e", ". ");
        morse.put("f", "..-. ");
        morse.put("g", "--. ");
        morse.put("h", ".... ");
        morse.put("i", ".. ");
        morse.put("j", ".--- ");
        morse.put("k", "-.- ");
        morse.put("l", ".-.. ");
        morse.put("m", "-- ");
        morse.put("n", "-. ");
        morse.put("o", "--- ");
        morse.put("p", ".--. ");
        morse.put("q", "--.- ");
        morse.put("r", ".-. ");
        morse.put("s", "... ");
        morse.put("t", "- ");
        morse.put("u", "..- ");
        morse.put("v", "...- ");
        morse.put("w", ".-- ");
        morse.put("x", "-..- ");
        morse.put("y", "-.-- ");
        morse.put("z", "--.. ");
        morse.put("1", ".---- ");
        morse.put("2", "..--- ");
        morse.put("3", "...-- ");
        morse.put("4", "....- ");
        morse.put("5", "..... ");
        morse.put("6", "-.... ");
        morse.put("7", "--.... ");
        morse.put("8", "---.. ");
        morse.put("9", "----. ");
        morse.put("0", "----- ");
        morse.put(" ", "| ");
        morse.put(",", "--..-- ");
        morse.put("?", "..--.. ");
        morse.put("!", "-.-.-- ");
        morse.put(":", "---... ");
        morse.put("*", ".-.-.- ");

// Translation Morse to Englsih
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        morse.put(".----", "1");
        morse.put("..---", "2");
        morse.put("...--", "3");
        morse.put("....-", "4");
        morse.put(".....", "5");
        morse.put("-....", "6");
        morse.put("--...", "7");
        morse.put("---..", "8");
        morse.put("----.", "9");
        morse.put("-----", "0");
        morse.put("|", " ");
        morse.put("--..--", ",");
        morse.put("..--..", "?");
        morse.put("-.-.--", "!");
        morse.put("---...", ":");
        morse.put(".-.-.-", "*");
    }

    public String Fix_Morse(String read_line) {
        String morse_translated = "";

        if (read_line.contains(".") || (read_line.contains("-"))) { // checking input from user for morse symbols
            String[] outPutMorse = read_line.split(" "); //adding split to make the Morse code readable

            for (int i = 0; i < outPutMorse.length; i++) {
                morse_translated += morse.get(outPutMorse[i]);
            }
        } else {
            String[] outPutEnglish = read_line.split("");
            for (int i = 0; i < outPutEnglish.length; i++) {
                morse_translated += morse.get(outPutEnglish[i]);
                morse_translated.split(" ");
            }
        }
        return morse_translated;
    }

    public String Lower_input(String string_Input) { //lowering the input string

        return string_Input.toLowerCase();
    }

    public String Check_string(String string_Input) { //checking if the input text is string
        return string_Input;
    }
}
