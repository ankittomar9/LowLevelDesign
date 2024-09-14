package AdderSubtractorSyncMethod;



import java.util.concurrent.Callable;


public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value x){
        v=x;
    }
    public Void call() {
        for(int i = 1; i <=100; i++) {
            this.v.incrementBy(i);
            System.out.println("Adder" +i);
        }
        return null;
    }
}
