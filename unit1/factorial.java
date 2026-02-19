// Anshika Mishra
// 2400320100227 

public class factorial {
    static int factorialrecursion(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorialrecursion(n-1);
    }   
    static int factorialiterative(int n){
        int result=1;
        for(int i=n;i>=1;i--){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        int number=5;
        System.out.println("factorial of " +number+" is : " +factorialrecursion(number));
        System.out.println("factorial of " +number+" is : " +factorialiterative(number));
    }
}
