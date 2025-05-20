public class Teacher {
    String name ;
    int id;
    float salary;

    void display(){
        System.out.println("Name is  "  + this.name + "  Id is  "  + this.id  + "  Salary is  "  + this.salary);

    }
     void setValue(String name, int id, float salary){
        this.name= name;
        this.id= id;
        this.salary=salary;
    }
    float getSalary(){
        return this.salary;
    }
 }
