import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    Scanner input= new Scanner(System.in);
System.out.println("Enter the array size: ");
int size= input.nextInt();
int[]arr= new int [5];
System.out.println("Enter the values of array: ");
for(int i=0; i<size; i++)
{
    arr[i]=input.nextInt();
}
for(int i=0; i<size;i++)
{
System.out.println("The value is: ");
}
    }

















    /*public static void main(String[]args){
        Student S1= new Student();
        S1.name= "Wonyoung Jang";
        S1.id= 241;
        S1.cgpa= 3.8f;
        S1.display();

      //  Student S1= new Student();
        S1.setValue("Wonyoung", 241, 3.5f);
        S1.display();
    }*/
   /*  public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Student s1= new Student();
        System.out.println("Enter your name: ");
        s1.name= sc.next();
        System.out.println("Enter your Id: ");
        s1.id= sc.nextInt();
        System.out.println("Enter your CGPa: ");
        s1.cgpa= sc.nextInt();
        s1.display();
         
        
    }*/
/*public static void main(String[]args){ 
    Scanner sc= new Scanner(System.in);
    circle c1= new circle();
    System.out.println("Enter  radius: ");
    c1.radius=sc.nextFloat();
    c1.area();
    c1.PI=4.3f;
}*/
}
