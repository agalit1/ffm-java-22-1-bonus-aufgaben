import org.example.LevelExpert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelExpertTest {
    @Test
    public void abcEqualsCba(){
        //given
        String input = "abc";

        //when
        String actual = LevelExpert.reverseString(input);

        //then
        assertEquals("cba", actual);
    }

}