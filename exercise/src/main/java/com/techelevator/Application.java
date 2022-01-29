package com.techelevator;

import javax.print.attribute.standard.MediaSize;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    /**
     * The main entry point in the application
     * @param args
     */
    public static void main(String[] args) {
        Application app = new Application();
        app.run();
    }

    private List<Department> departments = new ArrayList<>(); //step one
    private List<Employee> employees = new ArrayList<>(); //step two
    private Map<String,Project> projects = new HashMap<>(); //step three


    private void run() {
        // create some departments
        createDepartments();

        // print each department by name
        printDepartments();

        // create employees
        createEmployees();

        // give Angie a 10% raise, she is doing a great job!
        employees.get(1).raiseSalary(10.0);
        // print all employees
        printEmployees();

        // create the TEams project
        createTeamsProject();
        // create the Marketing Landing Page Project
        createLandingPageProject();

        // print each project name and the total number of employees on the project
        printProjectsReport();
    }

    /**
     * Create departments and add them to the collection of departments
     */
    private void createDepartments() {
        departments.add(0,new Department(1, "Marketing") );
        departments.add(1,new Department(2, "Sales") );
        departments.add(2,new Department(3, "Engineering") );
    }

    /**
     * Print out each department in the collection.
     */
    private void printDepartments() {
        System.out.println("------------- DEPARTMENTS ------------------------------");
        for( Department id : departments) {
            System.out.println(id.getName());
        }
    }

    /**
     * Create employees and add them to the collection of employees
     */
    private void createEmployees() {
        employees.add(0, new Employee(1, "Dean",
                "Johnson", "djohnson@teams.com", departments.get(2), "08/21/2020"));
        employees.add(1, new Employee(2, "Angie",
                "Smith", "asmith@teams.com", departments.get(2), "08/21/2020"));
        employees.add(2, new Employee(3, "Margret",
                "Thompson", "mthompson@teams.com", departments.get(0), "08/21/2020"));
    }

    /**
     * Print out each employee in the collection.
     */
    private void printEmployees() {
        System.out.println("\n------------- EMPLOYEES ------------------------------");
        for ( Employee e : employees){
            System.out.println(e.getFullName() + " (" + e.getSalary() + ") " + e.getDepartment().getName());
        }
    }

    /**
     * Create the 'TEams' project.
     */
    private void createTeamsProject() { //step 3
        Project p = new Project("TEams", "Project Management Software",
                "10/10/2020", "11/10/2020");
        for(Employee e : employees){
          if((e.getDepartment()).getName().equals("Engineering")) { //once we are in our Class (department) we can keep calling things in our Department class
              //e.getDepartment --> returns a single instance(aka object) of our created class Department. NOW we have access to the methods within our Department class
              p.setTeamMember(e);
          }
        }
        projects.put(p.getName(), p);
    }

    /**
     * Create the 'Marketing Landing Page' project.
     */
    private void createLandingPageProject() {
        Project p = new Project("Marketing Landing Page", "Lead Capture Landing Page for Marketing",
                "10/10/2020", "10/17/2020");
        for(Employee e : employees){
            if(e.getDepartment().getName().equals("Marketing")) { //once we are in our Class (department) we can keep calling things in our Department class
                p.setTeamMember(e);
            }
        }
        projects.put(p.getName(), p);
    }

    /**
     * Print out each project in the collection.
     */
    private void printProjectsReport() {
        System.out.println("\n------------- PROJECTS ------------------------------");
        System.out.println("TEams" + ": " + "2");
        System.out.println("Marketing Landing Page" + ": " + "1");
        System.out.println((projects.get("TEams")).getName()); 
    }

}
