import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<String> out;
        Machine fst = new Machine();
        fst.add_state("q0" , false);
//        fst.add_state("s1", false);
//        fst.add_state("s2" , true);
        fst.add_state("qf" , true);

        fst.add_transition("q0", 'a', '$', "q0");
        fst.add_transition("q0", 'b', 'b', "q0");
        fst.add_transition("q0", 'a', '$', "qf");
        fst.add_transition("q0", '$', '$', "qf");
        out=fst.parse_input("aaba", "q0");

//
//        //phase 2 : incomplete
//        fst.add_state("s3", false);
//        fst.add_state("s5", false);
//        fst.add_state("s6", false);
//        fst.add_state("s7", false);
//        fst.add_state("s8", false);
//        fst.add_state("s9", false);
//        fst.add_state("s10", false);
//        fst.add_state("s11", false);
//        fst.add_state("s12", false);
//        fst.add_state("s13", false);
//        fst.add_state("s14", false);
//        fst.add_state("s15", false);
//        fst.add_state("s16", false);
//        fst.add_state("s17", false);
//        fst.add_state("s18", false);
//        fst.add_state("s19", false);
//        fst.add_state("s20", false);
//        fst.add_state("s21", false);
//        fst.add_state("s22", false);
//        fst.add_state("s23", false);
//        fst.add_state("s4", true);
//        fst.add_set_transition("s0", "abcdefghijklmnopqrstuvwxyz", "s0");
//        fst.add_set_transition("s0", "abcdefghijklmnopqrtuvwxyz", "s1");
//        fst.add_transition("s1", 's', 's', "s2");
//        fst.add_transition("s2", '$', 'e', "s3");
//        fst.add_transition("s3", '$', 's', "s4");
//        fst.add_transition("s0", 's', 's', "s5");
//        fst.add_transition("s5", 's', 's', "s6");
//        fst.add_transition("s6", '$', '$', "s2");
//        fst.add_transition("s5", 'h', 'h', "s7");
//        fst.add_transition("s7", '$', '$', "s2");
//        fst.add_transition("s0", 'c', 'c', "s8");
//        fst.add_transition("s8", 'h', 'h', "s9");
//        fst.add_transition("s9", '$', '$', "s2");
//        fst.add_set_transition("s0", "bcdfghjklmnpqrstvwxyz", "s10");
//        fst.add_transition("s10", 'y', '$', "s11");
//        fst.add_transition("s11", '$', 'i', "s2");
//        fst.add_set_transition("s0", "aeiou", "q12");
//        fst.add_transition("s12", 'y', 'y', "s13");
//        fst.add_transition("s13", '$', 's', "s4");
//        fst.add_transition("s0", 'f', 'v', "s14");
//        fst.add_transition("s14", '$', 'e', "s15");
//        fst.add_transition("s15", '$', 's', "s4");
//        fst.add_transition("s14", 'e', 'e', "s16");
//        fst.add_transition("s16", '$', 's', "s4");
//        fst.add_transition("s0", 'x', 'x', "s17");
//        fst.add_transition("s17", '$', '$', "s14");
//        fst.add_transition("s0", 'o', 'o', "s18");
//        fst.add_transition("s18", '$', '$', "s14");
//        fst.add_transition("s0", 'z', 'z', "s19");
//        fst.add_transition("s19", '$', '$', "s14");
//        fst.add_set_transition("s0", "abcdeghijklmnpqrtuvw", "s20");
//        fst.add_transition("s20", '$', '$', "s16");
//        fst.add_set_transition("s0", "abdefghijklmnopqrtuvwxyz", "s21");
//        fst.add_transition("s21", 'h', 'h', "s22");
//        fst.add_transition("s22", '$', '$', "s16");
//        fst.add_set_transition("s0", "abcdeghijklmnopqrstuvwxyz", "s23");
//        fst.add_transition("s23", '$', '$', "s16");
//        out = fst.parse_input("bus", "s0");



//        example 1
//        fst.add_set_transition("s0", "bus","s0");
//        fst.add_transition("s0",'s','s',"s1");
//        fst.add_set_transition("s0", "bus","s2");
//        fst.add_transition("s1",'$','$',"s2");
//        fst.add_transition("s1",'s','$',"s2");
//        out = fst.parse_input("bus", "s0");


//        fst.add_set_transition("s0", "abcdefghijklmnopqrstuvwxyz", "s0");
//        fst.add_transition("s0" , 's' , 's' , "s1");
//        fst.add_set_transition("s0", "abcdefghijklmnopqrtuvwxyz" , "s2");
//        fst.add_transition("s1", '$', '$', "s2");
//        fst.add_transition("s1", 's', '$', "s2");
//        out = fst.parse_input("chess", "s0");

        if(out.size()!=0){
            for(String s : out){
                System.out.println(s);
            }
        }
        else{
            System.out.println("FAIL");
        }

    }
}
