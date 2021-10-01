//Element present in Hashset or not
 package demo.collect.com;
import java.util.Collection;
import java.util.*;

public class EleExtHset {
    public static void main(String[] args) {
        Set<String> s1=new HashSet<>();
        s1.add("Hii");
        s1.add("Welcome");
        s1.add("T0");
        s1.add("Hash");
        s1.add("Set");
        System.out.println("The elemets present are:"+s1);
        System.out.println(s1.contains("T0"));
        System.out.println(s1.contains("Hello"));

    }
}
