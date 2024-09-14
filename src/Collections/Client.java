package Collections;
import java.util.*;


public class Client {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
        List<Integer> list3=new Vector<>();
        List<Integer> list4=new Stack<>();

        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new TreeSet<>();
        Set<Integer> set3=new LinkedHashSet<>();

        set.add(5);
        set.add(41);
        set.add(6);
        set.add(72);
        set.add(3);
        set.add(9);

        set2.add(5);
        set2.add(4);
        set2.add(6);
        set2.add(7);
        set2.add(3);
        set2.add(9);

        set3.add(5);
        set3.add(4);
        set3.add(6);
        set3.add(7);
        set3.add(3);
        set3.add(9);

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);

    }
}
