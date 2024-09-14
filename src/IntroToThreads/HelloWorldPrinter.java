package IntroToThreads;

public class HelloWorldPrinter implements Runnable {
    public void run(){

        //Details of the task that needs to be performed
        System.out.println("Hello World : " + Thread.currentThread().getName());


    }
}
