package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class BracketsTest {
    
    @Test
    public void testParenthesisEmpty() {
        assertTrue(Brackets.Parenthesis(""));
    }
    
    @Test
    public void testParenthesisSimple() {
        assertTrue(Brackets.Parenthesis("()"));
    }
    
    @Test
    public void testParenthesisDouble() {
        assertTrue(Brackets.Parenthesis("(())"));
    }
    
    @Test
    public void testParenthesisTripleMix() {
        assertTrue(Brackets.Parenthesis("(()())"));
    }
    
    @Test
    public void testParenthesisInvalid_1() {
        assertFalse(Brackets.Parenthesis(")"));
    }
    
    @Test
    public void testParenthesisInvalid_2() {
        assertFalse(Brackets.Parenthesis("(()("));
    }
    
    @Test
    public void testParenthesisVaried_1() {
        assertTrue(Brackets.Parenthesis("{[()]}"));
    }
    
    @Test
    public void testParenthesisInvalidVaried_1() {
        assertFalse(Brackets.Parenthesis("{[(])}"));
    }
    
    @Test
    public void testParenthesisInvalidVaried_2() {
        assertFalse(Brackets.Parenthesis("([{])}"));
    }
}
