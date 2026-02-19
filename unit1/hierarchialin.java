// Anshika Mishra
// 2400320100227
//animal->dog
//animal->cat
class animal{
    String type;
    int age;
    void displayanimal(){
        System.out.println("type : "+type);
        System.out.println("age : "+age);
    }
}
class dog extends animal{
    String breed;
    void displaydog(){
        System.out.println("breed : "+breed);
    }
}
class cat extends animal{
    String name;
    void displaycat(){
        System.out.println("name : "+name);
    }
}
public class hierarchialin {
    public static void main(String[] args) {
        dog d=new dog();
        cat c=new cat();
        d.type="dogsss";
        d.breed="german";
        c.type="cattsss";
        c.name="kitty";
        d.displayanimal();
        d.displaydog();
        c.displayanimal();
        c.displaycat();      
    }
}
