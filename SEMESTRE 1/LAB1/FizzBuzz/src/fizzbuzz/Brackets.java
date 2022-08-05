package fizzbuzz;

import java.util.Stack;

public class Brackets {
    
    public static boolean Parenthesis (String SomeThing){
        final char OpeningParenthesis = '(', ClosingParenthesis = ')', OpeningBracket = '[', ClosingBracket = ']', OpeningCurlyBracket = '{', ClosingCurlyBracket = '}';
        
        char[] vector = SomeThing.toCharArray();
        Stack thing = new Stack();
        
        for (char sign : vector){
            if (sign==OpeningParenthesis) {
               thing.push(sign);
            }else if (sign==ClosingParenthesis) {
                if (thing.isEmpty()) {
                    return false;
                }else if (thing.peek().equals(OpeningParenthesis)) {
                    thing.pop();
                }
            }
            if (sign==OpeningBracket) {
               thing.push(sign);
            }else if (sign==ClosingBracket) {
                if (thing.isEmpty()) {
                    return false;
                }else if (thing.peek().equals(OpeningBracket)) {
                    thing.pop();
                }
            }
            if (sign==OpeningCurlyBracket) {
               thing.push(sign);
            }else if (sign==ClosingCurlyBracket) {
                if (thing.isEmpty()) {
                    return false;
                }else if (thing.peek().equals(OpeningCurlyBracket)) {
                    thing.pop();
                }
            }
        }
        
        return thing.isEmpty();
        
    }
}
