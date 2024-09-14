package ThreadPool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {


       // ExecutorService es = Executors.newFixedThreadPool(10); //Fixed number of threads
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1;i<=1000;i++){

            if(i==450){
                System.out.println("");
            }
         NumberToPrint2 x=new NumberToPrint2(i);
            es.execute(x);
        }


    }
}
