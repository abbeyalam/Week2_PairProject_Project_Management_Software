package com.techelevator;

public class Employee {

    //employeeID
    private long employeeId;
    //get
    public long getEmployeeId() {
        return employeeId;
    }
    //set
    public void setEmployeeId(){this.employeeId = employeeId;}


    //firstName
    private String firstName;
    //get
    public String getFirstName() {
        return firstName;
    }
    //set
    public void setFirstName() { this.firstName = firstName;}


    //lastName
    private String lastName;
    //get
    public String getLastName() {
        return lastName;
    }
    //set
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    //email
    private String email;
    //get
    public String getEmail(){
        return email;
    }
    //set
    public void setEmail(){
        this.email = email;
    }


    //salary
    private double salary;
    //get
    public double getSalary(){
        return salary;
    }
    //set
    public void setSalary(){
        this.salary = salary;
    }


    //department
    private Department department;
    //get
    public Department getDepartment(){
        return department;
    }
    //set
    public void setDepartment(){
        this.department = department;
    }


    //hireDate
    private String hireDate;
    //get
    public String getHireDate(){
        return hireDate;
    }
    //set
    public void setHireDate(){
        this.department = department;
    }

    //static constant
    private static double startingSalary = 60000;
    public static double getStartingSalary(){
        return startingSalary;
    } //we might not need?


    //Constructors
    public Employee(long employeeId, String firstName, String lastName, String email, Department department, String hireDate){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
        this.salary = startingSalary;
    }

    public Employee () {
        //no parameters
    }

    //methods

    public String getFullName(){
        return lastName + ", " + firstName;
    }

    public void raiseSalary(double percent){
        double raisedSalary = ((percent * salary) / 100) + salary;
        salary = raisedSalary;
    }
    //done with step 2
}
