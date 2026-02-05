// super class
class person{
    String name;
    int age;
    void displayperson(){
    System.out.println("name : "+name);
    System.out.println("age : "+age);
    }
}
//subclass
//above properties will come automatically
class student extends person{
    int rollno;
    void displaystudent(){
        System.out.println("rollno : "+rollno);
    }  
}
public class inheritance {
    public static void main(String[] args) {
        student s=new student();
        s.name="abc";
        s.age=10;
        s.rollno=123;
        s.displayperson();
        s.displaystudent();
    }
}
