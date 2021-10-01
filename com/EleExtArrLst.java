//Element present in ArrayList or not;
package demo.collect.com;
import java.util.Collection;
import java.util.*;

public class EleExtArrLst {
    public static void main(String[] args) {
        List<Integer> i1=new ArrayList<>();
        i1.add(101);
        i1.add(201);
        i1.add(301);
        i1.add(401);
        i1.add(501);
        System.out.println("The elements are: " + i1);
        System.out.println(i1.contains(301));
        System.out.println(i1.contains(801));

    }

}
