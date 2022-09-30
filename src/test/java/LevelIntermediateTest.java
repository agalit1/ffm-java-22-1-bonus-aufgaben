import org.example.LevelIntermediate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelIntermediateTest {

    @Test
    public void fiveReturnsFuenf() {
        //given
        int number = 5;

        //when
        String actual = LevelIntermediate.numberReturnString(number);

        //then
        assertEquals("Fuenf", actual);
    }
    @Test
    public void StringContainsHash() {
        //given

        //when
        String actual = LevelIntermediate.returnNumbersUpTo100();
        //then
        assertTrue(actual.contains("#"));
    }

}