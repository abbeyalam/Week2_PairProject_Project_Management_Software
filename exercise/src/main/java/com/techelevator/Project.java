package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Project {

    //name
    private String name;
    //get
    public String getName(){
        return name;
    }
    //set
    public void setName(String name){
        this.name = name;
    }

    //description
    private String description;
    //get
    public String getDescription(){
        return description;
    }
    //set
    public void setDescription(String description){
        this.description = description;
    }

    //startDate
    private String startDate;
    //get
    public String getStartDate(){
        return startDate;
    }
    //set
    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    //dueDate
    private String dueDate;
    //get
    public String getDueDate(){
        return dueDate;
    }
    //set
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    //teamMembers
    private List<Employee> teamMember = new ArrayList<>();
    //get
    public List<Employee> getTeamMember(){
        return teamMember;
    }
    //set
    public void setTeamMember(Employee teamMember){
        this.teamMember.add(teamMember);
    }


    //Constructors
    public Project(String name, String description, String startDate, String dueDate){
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
    }


}
