import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class kmpAlgoTest {

    private kmpAlgo kmp;

    @BeforeEach
    public void setUp() {
        kmp = new kmpAlgo();
    }

    @Test
    public void testShortText() {
        String text = "ABABABC";
        String pattern = "ABAB";
        List<Integer> expected = List.of(0, 2);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testMediumString() {
        String text = "AABACAADAABAAABAAABACAAABA";
        String pattern = "AABA";
        List<Integer> expected = List.of(0, 8, 12, 16, 22);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testLongString() {
        String text = "AABACAADAABAAABAAABACAAABAAABACAAABAAABAC";
        String pattern = "AAABAC";
        List<Integer> expected = List.of(15, 25, 35);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyText() {
        String text = "";
        String pattern = "ABC";
        List<Integer> expected = List.of();
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }
    @Test
    public void testEmptyPattern() {
        String text = "ABCDEF";
        String pattern = "";
        List<Integer> expected = List.of();
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testPatternLongerThanText() {
        String text = "AB";
        String pattern = "ABC";
        List<Integer> expected = List.of(); 
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testPatternNotInText() {
        String text = "ABCDEFG";
        String pattern = "XYZ";
        List<Integer> expected = List.of(); 
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testTextEqualsPattern() {
        String text = "HELLO";
        String pattern = "HELLO";
        List<Integer> expected = List.of(0);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testRepeatingCharacters() {
        String text = "AAAAAA";
        String pattern = "AAA";
        List<Integer> expected = List.of(0, 1, 2, 3);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }

    @Test
    public void testPatternOnceInMiddle() {
        String text = "ABCDEFG";
        String pattern = "CDE";
        List<Integer> expected = List.of(2);
        List<Integer> result = kmp.kmpAlgo(pattern, text);
        assertEquals(expected, result);
    }
}
