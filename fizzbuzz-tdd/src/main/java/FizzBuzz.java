public class FizzBuzz {
    private String output;
    public String getOutputFor(int input){
        FizzBuzzRule rule = new FizzBuzzRule(input);
        return rule.getOutput();
    }


}
