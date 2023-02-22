import java.util.ArrayList;

public class State {

    private String state_name;
    private Boolean is_final;
    public ArrayList<Transition> transitions = new ArrayList<>();

    public State(String state_name, Boolean is_final) {
        setState_name(state_name);
        setIs_Final(is_final);
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public void setIs_Final(Boolean is_Final) {
        this.is_final = is_Final;
    }

    public String getState_name() {
        return state_name;
    }

    public Boolean getIs_Final() {
        return is_final;
    }

    public ArrayList<Transition> getTransitions() {
        return transitions;
    }
}