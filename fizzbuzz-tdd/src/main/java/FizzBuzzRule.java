public class FizzBuzzRule {
    private static final String FIZZ = "Fizz";
    private static final int FIZZ_NUMERIC_VALUE = 3;
    private static final String BUZZ = "Buzz";
    private static final int BUZZ_NUMERIC_VALUE = 5;
    private final int input;
    private String output = "";

    public FizzBuzzRule(int input) {
        this.input = input;
    }

    public String getOutput(){
        addStringToOutputIfInputDivisibleOrContains(FIZZ, FIZZ_NUMERIC_VALUE);
        addStringToOutputIfInputDivisibleOrContains(BUZZ, BUZZ_NUMERIC_VALUE);
        addInputToOutputIfOutputIsEmpty();
        return output;
    }

    private void addStringToOutputIfInputDivisibleOrContains(String string, int value){
        addIfDivisible(string, value);
        addIfContains(string, value);
    }

    private void addIfDivisible(String string, int value){
        if(input % value == 0){
            output += string;
        }
    }

    private void addIfContains(String string, int value){
        if(inputContainsValue(value)){
            output += string;
        }
    }

    private boolean inputContainsValue(int value){
        return String.valueOf(input).contains(String.valueOf(value));
    }

    private void addInputToOutputIfOutputIsEmpty(){
        if(output.isEmpty()){
            output += input;
        }
    }
}
