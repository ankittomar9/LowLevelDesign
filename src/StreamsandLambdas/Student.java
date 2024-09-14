package StreamsandLambdas;

public class Student {
    public int rollNo;
    public int age;
    public String name;
    public String batch;

    public Student(int rollNo, int age, String name, String batch) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.batch = batch;
                }
         public int compareTo(Student other) {
        //this object with other object
             //asc order of age
             if(this.age < other.age){
                 return -1;
             }else if(this.age > other.age){
                 return 1;
             }
             return 0;
         }
}

