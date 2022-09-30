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

    @Test
    public void returnStringABCAsArray(){
        //given
        String input = "a,bc,def";
        //when
        String[] actual = LevelExpert.convertStringToArray(input);
        //then
        String[] expected = new String[]{"a", "bc", "def"};
        assertArrayEquals(expected,actual);
    }
    @Test
    public void checksumOf312Is6() {
        //given
        int number = 312;
        //when
        int actual = LevelExpert.checksum(number);
        //then
        assertEquals(6,actual);
    }

}