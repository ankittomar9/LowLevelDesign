package Interfaces;
import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //Interfaces can act as custom types now


        Runner r =new Dog();
        //r.bark();
        r.run();

        Runner h=new Human();
        h.run();

//        Car h1=new Human();
//        h1.run();
//        Car c=new Car();
//        c.running();


/*
  *//*      List<Runner> participants; // add who can use runner implements
        participants =new ArrayList<Runner>();
        participants.add(new Human());
        participants.add(new Dog());

        for(Runner r2:participants ){
            r2.run();*//*
        }*/
    }
}
