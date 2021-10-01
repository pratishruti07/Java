//Traverse an Arraylist
package demo.collect.com;
import java.util.Collection;
import java.util.*;

public class ItrArrLst {
    public static void main(String[] args) {
      List<Integer> i1=new ArrayList<>();
      i1.add(1);
        i1.add(2);
        i1.add(3);
        i1.add(4);
        i1.add(5);

        Iterator it=i1.iterator();

        while (it.hasNext()){
            System.out.println(it.next());

        }

    }
}
