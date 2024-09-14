package IntroToThreadsRawProblem;

public class Client {
    public static void main(String[] args) {

        System.out.println("I am the main class");

        Adder a=new Adder();
        Thread t1=new Thread(a);
        t1.start();


    }
}
