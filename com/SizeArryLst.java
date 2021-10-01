//Length of ArrayList

package demo.collect.com;
import java.util.Collection;
import java.util.*;

public class SizeArryLst {
    public static void main(String[] args) {


        List<String> l1= new ArrayList<>();

        System.out.println("Size of ArrayList is :"+ l1);
        l1.add("Welcome to ArrayList.");
        l1.add("Welcome to ArrayList.");
        l1.add("Welcome to ArrayList.");
        l1.add("Welcome to ArrayList.");
        int siz=l1.size();
        System.out.println("Size of ArrayList is :"+ siz);
    }
}
