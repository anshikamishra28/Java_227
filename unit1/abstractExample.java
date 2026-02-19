abstract class vehicle{

    // used to hide universal behaviour
    // encapsulation-privacy

    abstract void start(); // no body
    void fuel(){
        System.out.println("fuel");
    }
}

class car extends vehicle{
    void start(){
        System.out.println("car start hai");
    }
}

class bike extends vehicle{
    void start(){
        System.out.println("bike start hai");
    }
}

public class abstractExample {
    public static void main(String[] args) {
        
    }
    
}
