import java.io.*;
public class Employee{
  String name;
  int age;
  String designation;
  double salary;

  //This is the constructor of the class Employee
  public Employee(String name){
    this.name=name;
  }

  //Assigning the age of the employee to the variable age
  public void empAge(int empAge){
    age = empAge;
  }

  //Assigning designation to the variable designation
  public void empDesignation (String empDesig){
    designation = empDesig;
  }

  /*Assigning Salary to the variable salary*/
  public void empSalary(double empSalary){
    salary = empSalary;
  }

  //Print the employee details
  public void printEmployee(){
    System.out.println("Name: "+ name);
    System.out.println("Age: "+ age);
    System.out.println("Designation: "+ designation);
    System.out.println("Salary: " + salary);
  }


}