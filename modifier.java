public class modifier {
    public int a=10;
    private int b=20;
    protected int c=30;
    int s=40;
    public static void main(String[] args) {
        modifier obj=new modifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.s);
    }  
}
