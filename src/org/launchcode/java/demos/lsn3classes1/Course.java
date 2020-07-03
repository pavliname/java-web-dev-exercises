package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents=0;
    private String teacher;

    public Course (String name, ArrayList<String> students, int numberOfStudents, String teacher) {
        this.name=name;
        this.students=students;
        this.numberOfStudents=numberOfStudents;
        this.teacher=teacher;
    }

    public String getName(){
        return name;
    }

    public void setName(String aName){
        name=aName;
    }

    public ArrayList getStudents(){
        return students;
    }

    public void setStudents(ArrayList aStudents){
        students=aStudents;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public void setNumberOfStudents(int aNumberOfStudents){
        numberOfStudents=aNumberOfStudents;
    }

    public String getTeacher(){
        return teacher;
    }

    public void setTeacher(String aTeacher){
        teacher=aTeacher;
    }

}
