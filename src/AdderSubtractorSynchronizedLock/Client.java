package AdderSubtractorSynchronizedLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args)  throws ExecutionException,InterruptedException {
        Value v=new Value();
        Lock lock=new ReentrantLock();
        Adder x=new Adder(v,lock);
        Subtractor y=new Subtractor(v,lock);


        ExecutorService ec= Executors.newCachedThreadPool();

        Future<Void> addedFuture=ec.submit(x);
        Future<Void> subtractorFuture= ec.submit(y);

        addedFuture.get();
        subtractorFuture.get();
        System.out.println(v.value);
    }
}
