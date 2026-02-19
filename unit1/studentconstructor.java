// Anshika Mishra
// 2400320100227

class studentconstructor {
    int id;
    String name;
    studentconstructor(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println("id : "+id+" Name : "+name);
    }
    public static void main(String[] args) {
        studentconstructor s1=new studentconstructor(100,"Anshika");
        s1.display();
        s1.display();
    }  
}
