package ExceptionHandling;

import java.io.FileNotFoundException;

public class Student {
    public static int doSomething(int x) throws ClassNotFoundException, FileNotFoundException {
        System.out.println("doSomething");
        if(x==0){
            return x;
        }
        if(x%2==0){
            throw new ClassNotFoundException();
        }
        else if(x%5==0){
            throw new FileNotFoundException();
        }
        return 1/x;
    }

}

// Exception : checked give the declare that i can throw this exception