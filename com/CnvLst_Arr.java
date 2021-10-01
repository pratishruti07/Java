//Convert list to Array
package demo.collect.com;
import java.util.Collection;
import java.util.*;

public class CnvLst_Arr {
    public static void main(String[] args) {
        List<String> l1=new ArrayList<>();
        l1.add("hii");
        l1.add("Hello");
        l1.add("Byee");
        l1.add("Okey");
        l1.add("Byee");
        System.out.println("Items in list are" +l1);


        String[] arr1=new String[l1.size()];
        arr1=l1.toArray(arr1);

        System.out.println("_________________________________");
        for(String s:arr1){
            System.out.println(s);
        }
    }
}
