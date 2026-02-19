class InsufficientBalanceException extends Exception{
    // constructor 
        public InsufficientBalanceException(String message){
            // super communicates with parent class
            super(message);
        }
    }
    class BankAccount {
        double balance=5000;
        void withdraw(double amount) throws InsufficientBalanceException{
            if(amount>balance){
                throw new InsufficientBalanceException("insufficient");//user defined exception
            }
            else{
                balance-=amount;
                System.out.println("withdrawal successful");
            }  
    }
    public class CombineDemo{
        public static void main(String[] args) {
            try{
                int x=10/0;
            }catch(Exception e){
                System.out.println("error");
            }
            BankAccount account=new BankAccount();
            try {
                account.withdraw(7000);              
            } catch (Exception e) {
                System.out.println("custom error : "+e.getMessage());                
            }
            System.out.println("successful");
        }
    }    
}
