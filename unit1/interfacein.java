// interface is used to overcome the diamond problem created in mutiple inheritence

interface A  {
    void showA();
}
interface B {
    void showB();
}
class C implements A,B{
    public void showA(){
        int age=10;
        System.out.println("age : "+age);
    }
    public void showB(){
        int num=20;
        System.out.println("number : "+num);
    }
}
public class interfacein {
    public static void main(String[] args) {
        C c=new C();
        c.showA();
        c.showB();
    }     
}
