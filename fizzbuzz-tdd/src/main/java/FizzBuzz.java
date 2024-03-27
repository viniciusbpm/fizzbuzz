public class FizzBuzz {
    public String getOutputFor(int input){
        if(input % 3 == 0){
            return "Fizz";
        }
        
        return String.valueOf(input);
    }
}
