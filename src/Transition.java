public class Transition {

    private String in_state_name;
    private char input;
    private char output;
    private String out_state_name;

    public Transition(String in_state_name , char input , char output , String out_state_name){
        setIn_state_name(in_state_name);
        setInput(input);
        setOutput(output);
        setOut_state_name(out_state_name);
    }

    public void setIn_state_name(String in_state_name) {
        this.in_state_name = in_state_name;
    }

    public void setInput(char input) {
        this.input = input;
    }

    public void setOutput(char output) {
        this.output = output;
    }

    public void setOut_state_name(String out_state_name) {
        this.out_state_name = out_state_name;
    }

    public String getIn_state_name() {
        return in_state_name;
    }

    public char getInput() {
        return input;
    }

    public char getOutput() {
        return output;
    }

    public String getOut_state_name() {
        return out_state_name;
    }
}
