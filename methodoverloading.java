public class methodoverloading {

    int add(int a,int b){
        return a+b;

    }
    int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        methodoverloading a=new methodoverloading();
        System.out.println(a.add(10,20));
        System.out.println(a.add(30,34,56));

    }
    
}
