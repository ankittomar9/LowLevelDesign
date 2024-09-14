package RefvsInstance;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        s1.display();


        //Student s2 = s1; //reference not actual object value copy
        Student s2 = new Student();
//        s2.age = 20;
//        s2.name = "B";

        Student temp =s1;
        s1=s2;
        s2=temp;

        s2.display();

      //  s1.display();
    }
}