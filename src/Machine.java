import java.util.ArrayList;

public class Machine {

    int count = 0;
    ArrayList<State> states = new ArrayList<>();
    ArrayList<String> out = new ArrayList<>();
    String output = "";
    State start;
    State next;

    public void add_state(String state_name, Boolean is_final) {
        if (count == 0) {
            start = new State(state_name, is_final);
            states.add(start);
            count++;
        } else {
            states.add(new State(state_name, is_final));
        }
    }

    public void add_transition(String in_state_name, char input, char output, String out_state_name) {
        State in = null;
        for (State s : states) {
            if (in_state_name.equals(s.getState_name())) {
                in = s;
            }
        }
        if (in != null)
            in.transitions.add(new Transition(in_state_name, input, output, out_state_name));
    }

    public void add_set_transition(String in_state_name, String input_set, String out_state_name) {
        for (int i = 0; i < input_set.length(); i++) {
            char curr = input_set.charAt(i);
            add_transition(in_state_name, curr, curr, out_state_name);
        }
    }

    public ArrayList<String> parse_input(String input_string, String state) {
        Transition t1=null;
        for (State s : states) {
            if (state.equals(s.getState_name())) {
                next = s;
                break;
            }
        }
        if(next.getIs_Final() && input_string.length()==0){
            out.add(output);
        }

        for (Transition t : next.transitions) {
            t1=t;
            if (input_string.length()!=0 && t.getInput() == (input_string.charAt(0))) {
                if(t.getOutput()!='$'){
                    output += t.getOutput();
                }
                if (t.getInput() != '$') {
                    parse_input(input_string.substring(1) , t.getOut_state_name());
                }
            }
            if(t.getInput() == '$'){

                parse_input(input_string , t.getOut_state_name());
            }
        }
        if(t1!=null) {
            if ( !next.getIs_Final() || (next.getIs_Final() && input_string.length() == 0 || t1.getInput() != '$')) {
                output = output.substring(0, output.length() - 1);
            }
        }

        return out;
    }

}