
//animal->dog
//dog->puppy
//multiple inheritence not supported in java due to diamond problem 
// interface came to overcome it
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
class puppy extends dog{
    String name;
    void displaypuppy(){
        System.out.println("name : "+name);
    }
}
public class multiplein {
    public static void main(String[] args) {
        puppy p=new puppy();
        p.type="dog";
        p.age=10;
        p.breed="german shepherd";
        p.name="tommy";
        p.displayanimal();
        p.displaydog();
        p.displaypuppy();
    }
}