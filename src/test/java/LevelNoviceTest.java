import org.example.LevelNovice;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class LevelNoviceTest {

    @Test
    public void anaEquals5TimesAna() {
        //given
        String name = "ana";
        ByteArrayInputStream consoleIn = new ByteArrayInputStream(name.getBytes());
        System.setIn(consoleIn);

        //when
        String actual = LevelNovice.printName5Times();

        //then
        String expected = "Your name:\nana\nana\nana\nana\nana";
        assertEquals(expected,actual);
    }

    @Test
    public void anaGreetingsOutput() {
        //given
        String name = "ana";
        ByteArrayInputStream consoleIn = new ByteArrayInputStream(name.getBytes());
        System.setIn(consoleIn);

        //when
        String actual = LevelNovice.greetUser();

        //then
        String expected = "Hello ana!";
        assertEquals(expected,actual);
    }

    @Test
    public void numberGreaterThan0() {
        //given
        int number = 5;

        //when
        boolean actual = LevelNovice.checkNumberGreaterThan0(number);

        //then
        assertTrue(actual);
    }

    @Test
    public void squareOf4Equals16() {
        //given
        int number = 4;

        //when
        int actual = LevelNovice.squareOfNumber(number);

        //then
        assertEquals(16,actual);
    }


}