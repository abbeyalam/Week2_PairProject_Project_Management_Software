package com.techelevator;

public class Department {

    //int departmentId
    private int departmentId;
    //departmentId getter
    public int getDepartmentId() {
        return departmentId;
    }
    //departmentId setter
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    //String name
    private String name;
    //name getter
    public String getName() {
        return name;
    }
    //name setter
    public void setName(String name) {
        this.name = name;
    }

    //constructor
    public Department (int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }

    //end of step one


}
