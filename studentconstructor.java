class studentconstructor {
    int id;
    String name;

    //constructor

    studentconstructor(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        studentconstructor s1=new studentconstructor(100,"abc");
        s1.display();
        s1.display();
    }  
}
