import java.io.*;
public class EmployeeTest{

  public static void main(String[] args) {
    /*creating two objects using constructor*/
    Employee empOne = new Employee("James Akon");
    Employee empTwo = new Employee("Miriam Akuns");
    
    //invoking methods for each object created
    empOne.empAge(26);
    empOne.empSalary(1000);
    empOne.empDesignation("Senior Software Developer");
    empOne.printEmployee();

    empTwo.empAge(22);
    empTwo.empSalary(500);
    empTwo.empDesignation("Software Developer");
    empTwo.printEmployee();

  }
}