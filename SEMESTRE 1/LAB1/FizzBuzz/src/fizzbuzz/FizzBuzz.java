package fizzbuzz;
    
public class FizzBuzz {

    public static String FizzBuzz (int num){
        
        String result = "";
        final int three = 3;
        final int five = 5;
        
        if (num<=0 || num>99)
            return "Invalid number.";
        
        for (int i = 1; i < num+1; i++) {
            if (i%three==0 && i%five==0) {
                result += "Fizz-Buzz";
            }else if (i%three==0) {
                result += "Fizz";
            }else if (i%five==0) {
                result += "Buzz";
            }else{
                result += i;
            }
            if (i<num) {
                result += " ";
            }
        }
        return result;
    }
}
