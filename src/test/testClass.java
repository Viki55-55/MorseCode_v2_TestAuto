package test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import test.Morse_translation;

import static org.junit.Assert.assertEquals;

public class testClass {

    private test.Morse_translation Morse_translation;

    public testClass() {
        Morse_translation = new Morse_translation();
    }

    @Test

    public void Test_English_To_Morse() {

        String english_to_morse = "a";
        String to_be_translated_to = ".- ";
        String translated = Morse_translation.Fix_Morse(english_to_morse);

        Assert.assertEquals(to_be_translated_to, translated);

    }

    @Test

    public void Morse_To_English() {

        String morse_to_english = ".-";
        String to_be_translated = "a";
        String translated = Morse_translation.Fix_Morse(morse_to_english);

        Assert.assertEquals(to_be_translated, translated);
    }

    @Test

    public void downToWord() {

        String input_string = "TesT";
        String to_check_string = "test";

        String checked_string = Morse_translation.Lower_input(input_string);

        assertEquals(input_string, checked_string);
    }

    @Test

    public void Check_char_is_not_Morse() {

        String input_char = "&";
        String to_check_char = "Invalid character";
        String checked_char = Morse_translation.Check_string(input_char);
        Assert.assertEquals(to_check_char, checked_char); //
    }

    @Test
    public void testCheckStringReturnsZeroForSpace() {

        String input_char = " ";
        String to_check_char = "0";
        String checked_char = Morse_translation.Check_string(input_char);
        Assert.assertFalse(to_check_char.equals(checked_char)); //
    }

}
