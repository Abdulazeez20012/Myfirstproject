import java.io.*;
public class Employee{   
   public String name;
   private double salary;
   public Employee (String empName){
      
   name = empName;
}
public void setSalary(double empSal) {
   salary = empSal;

}

public void printEmp() {
System.out.println("name :" + name );
System.out.println("salary :"+ salary);

}
public static void main(String args[])  {
   Employee empone = new Employee("Azeez");

empOne.setSalary(400000000);
empOne.printEmp(); 

}


}