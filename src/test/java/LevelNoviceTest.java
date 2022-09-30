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


}