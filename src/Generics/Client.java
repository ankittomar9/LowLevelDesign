package Generics;

public class Client {
    public static void main(String[] args) {
        Pair<Integer,String> s=new Pair<>(7,"Ankit");
        Integer s1=s.getFirst();
        s.setFirst(20);
        System.out.println(s);

    }
}
