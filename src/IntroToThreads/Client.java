package IntroToThreads;

public class Client {
    public static void main(String[] args) {


        HelloWorldPrinter h=new HelloWorldPrinter(); // Object of hello world printer

        System.out.println( "Thread : " +Thread.currentThread().getName());
        Thread t =new Thread(h);

        t.start();  // thread will be calling internally h.run();

      NumberPrinter n=new NumberPrinter();
      Thread t2=new Thread(n);

        t2.start();

        for(int i=1;i<=10000;i++){
            NumberToPrint2 x=new NumberToPrint2(i);
            Thread t3=new Thread(x);
            t3.start();
        }

        Thread t4 =new HelloWorldPrinter2();
        t4.start();
    }
}


//inCallService