package StreamsandLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Inside Runnable");

            }
        };
        //lambdas : which are used to create objects for
        //functional interfaces without
        Runnable r=()->{
            System.out.println("Inside Runnable in lambda function");
        };
            Thread thread=new Thread(()->{
                System.out.println("Inside Thread without storing in variable ");
            });
//        Thread thread = new Thread(r);

       thread.start();

       List<Student> l1=new ArrayList<>();
       l1.add(new Student(1,25,"Ankit","Sept23"));
       l1.add(new Student(7,22,"Naman","Sept23"));
       l1.add(new Student(2,21,"Pankaj","Sept23"));
       l1.add(new Student(5,19,"Pooja","Sept23"));

        Collections.sort(l1,(o1,o2)->{
            if(o1.age>o2.age){
                return 1;
            }else if (o1.age<o2.age){
                return -1;
            }
            return 0;
        });
            List<Integer> l2=List.of(18,21,5,10,7,8,2,4,12 ,11, 17);
            Stream<Integer> s1=l2.stream();
        /*    Intermediate vs Terminal
                Intermediate : return a stream
            only one terminal function can be used*/
        Long x=s1.limit(6).count();
        System.out.println(x);

        //As Soon as a terminal is used on a stream ,strean is closed
        //Long y=s1.count();

        Stream<Integer> s2=l2.stream();
        Long y=s2.filter((elem)->{
            return elem %2==0;
        }).count();
        System.out.println(y);

        List<Integer> l3=l2
                .stream().
                filter((elem) -> {
                    return elem%2==1;
                })
               // .sorted()
                               .collect(Collectors.toList());
        System.out.println(l3);

        List<Integer> l4=l2
                .stream().
                filter((elem) -> {
                    return elem%2==0;
                })
                .sorted()
                .map((elem)->{
                    return elem*elem;
                })
                .collect(Collectors.toList());
        System.out.println(l4);

    }
}
