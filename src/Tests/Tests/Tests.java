package Tests;

import com.company.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void testGreeting() {
        assertEquals("Hello, test suite", Main.greeting());
    }

    @Test
    public void testMaxOfTwoNumbers() {
        assertEquals(3, Main.maxOfTwoNumbers(1,3));
        assertEquals(5, Main.maxOfTwoNumbers(5,-4));
    }

    @Test
    public void testMaxOfThree() {
        assertEquals(5, Main.maxOfThree(1,3,5));
        assertEquals(3, Main.maxOfThree(1,3,-5));
        assertEquals(1, Main.maxOfThree(1,-3,-5));
    }

    @Test
    public void testIsCharacterAVowel() {
        assertEquals(true, Main.isCharacterAVowel("a"));
        assertEquals(false, Main.isCharacterAVowel("b"));
    }

    @Test
    public void testNumArgs() {
        assertEquals(4, Main.numArgs("apple", "banana", "cherries", "oranges"));
    }

    @Test
    public void testReverseString() {
        assertEquals("gninrom eht ni esrever ot tseb si ti", Main.reverseString("it is best to reverse in the morning"));
    }
}
