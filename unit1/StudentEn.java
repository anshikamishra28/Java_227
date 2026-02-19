// Anshika Mishra
// 2400320100227

public class StudentEn {
    private int rollno;
    private String name;
    private int marks;
    public void setRollNo(int rollno){
        this.rollno=rollno;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int marks){
        this.marks=marks;
        if(marks>= 0 && marks <=100)
        this.marks=marks;
        else
            System.out.println("Invalid marks");
    }
    public int getRollNo(){
        return rollno;
    }
    public String getName(){
        return name;
    }
    public int getMarks(){
        return marks;
    }
    public static void main(String[] args) {
        StudentEn s=new StudentEn();
        s.setRollNo(10);
        s.setName("Anshika");
        s.setMarks(80);
        System.out.println("Roll no : "+s.getRollNo());
        System.out.println("Name : "+s.getName());
        System.out.println("Marks : "+s.getMarks());
    }
}
