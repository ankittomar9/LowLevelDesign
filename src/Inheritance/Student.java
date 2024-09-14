package Inheritance;
public class Student extends User {
     String course;
     String batch;
      int age;
      void attendClass(){

          System.out.println("Student attend class");
      }

      void getname(){
          System.out.println(this.name);
          //System.out.println(this.Rollno);

      }

    Student() {

          System.out.println("Student Constructor");
    }
}
