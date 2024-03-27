public class FizzBuzzRule {
    private static final String FIZZ = "Fizz";
    private static final int FIZZ_NUMERIC_VALUE = 3;
    private static final String BUZZ = "Buzz";
    private static final int BUZZ_NUMERIC_VALUE = 5;

    private int input;
    private String output = "";

    public FizzBuzzRule(int input) {
        this.input = input;
    }

    public String getOutput(){
        addStringToOutputIfInputDivisibleBy(FIZZ, FIZZ_NUMERIC_VALUE);
        addStringToOutputIfInputDivisibleBy(BUZZ, BUZZ_NUMERIC_VALUE);
        addInputToOutputIfOutputIsEmpty();
        return output;
    }

    private void addStringToOutputIfInputDivisibleBy(String string, int value){
        if(input % value == 0){
            output += string;
        }
    }

    private void addInputToOutputIfOutputIsEmpty(){
        if(output.isEmpty()){
            output += input;
        }
    }
}
