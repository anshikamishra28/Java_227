
import java.io.*;

public class handling {
    public static void main(String[] args) {
        // int a=10;
        // int b=0;
        // System.out.println(a/b)
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
       // at handling.main(handling.java:5)
        

       // try catch
       // try creates object of the error which is passed as parameter in catch block
       // it holds what the actual error is 

       

        try{
       int a=10;
       int b=0;
       System.out.println(a/b);
        }catch(Exception e){
        System.out.println("cannot divide by zero");
    }
    System.out.println("program continue.....");

    // exception and error is class of throughback 
       // exception can be handled but some errors can't be handled like stack overflow

       // type pf exception
       // checked-compile time
       // unchecked-runtime 

       // checked
       try{
        FileReader file=new FileReader("abc.txt");
       }
       catch(Exception e){
        System.out.println("file not found");
       }

       // unchecked
    //    int[] arr={1,2,3};
    //    System.out.println(arr[5]);

    //    String name=null;
    //    System.out.println(name.length());

       //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null
        //at handling.main(handling.java:49)

       // finally


    try{
    int a=10;
    int b=0;
    System.out.println(a/b);
    }catch(Exception e){
    System.out.println("error");
    }finally{
    System.out.println("always run");
    }




}
}
