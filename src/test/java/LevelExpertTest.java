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

    @Test
    public void sortArray628396In236689(){
        //given
        int[] numbers = new int[]{6, 2, 8, 3, 9, 6};

        //when
        int[] actual = LevelExpert.sortArrayAscending(numbers);

        //then
        int[] expected = new int[]{2, 3, 6, 6, 8, 9};
        assertArrayEquals(expected, actual);
    }

}