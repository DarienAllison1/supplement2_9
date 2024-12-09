import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FunctionTests {

    /**
     * Test for getting all even numbers in a list.
     */
    @Test
    public void testGetEvenNumbers() {
        assertArrayEquals(new int[] {2, 4, 6}, Functions.getEvenNumbers(new int[] {1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[] {8, 10}, Functions.getEvenNumbers(new int[] {8, 10, 11, 13}));
        assertArrayEquals(new int[] {}, Functions.getEvenNumbers(new int[] {1, 3, 5, 7}));
    }

    /**
     * Test for converting a string to upper case.
     */
    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", Functions.toUpperCase("hello"));
        assertEquals("JAVA", Functions.toUpperCase("java"));
        assertEquals("", Functions.toUpperCase(""));
    }

    /**
     * Test for getting the longest string from a list.
     */
    @Test
    public void testGetLongestString() {
        assertEquals("longest", Functions.getLongestString(new String[] {"short", "medium", "longest"}));
        assertEquals("oneword", Functions.getLongestString(new String[] {"oneword", "another", "tiny"}));
        assertEquals("hello", Functions.getLongestString(new String[] {"hello", "hi"}));
    }
}
