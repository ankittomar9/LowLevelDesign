package IntroToThreads;

public class HelloWorldPrinter2  extends Thread{
    @Override
    public void run() {
        System.out.println("Hello World via Thread  extension");
    }
}


// Thread class run
// Now you can't extend any more class
//Composition vs Inheritance
//You always have to write a new thread but runnable way we can use  lambda expression
//Effectively thread also implemets Runnable ,So we not actually overiding the methods