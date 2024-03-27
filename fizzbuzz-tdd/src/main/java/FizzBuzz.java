public class FizzBuzz {
    public String getOutputFor(int input){
        FizzBuzzRule rule = new FizzBuzzRule(input);
        return rule.getOutput();
    }


}
