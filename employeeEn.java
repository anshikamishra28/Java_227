public class employeeEn {
    private String name;
    private Double salary;

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
        if(salary>1000 && salary<2000){
            System.out.println("ok");      
        }
        else{
            System.out.println("not");
        }
    }

    public String getName(){
        return name;
    }
    public Double getSalary(){
        return salary;
    }

    public static void main(String[] args) {

        employeeEn s=new employeeEn();
        s.setName("anshika");
        s.setSalary(1500.234);

        s.getName();
        s.getSalary();
        
    }
}
