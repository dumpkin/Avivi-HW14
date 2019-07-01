package com.dumpkin.avivi;


public class Student {
    private String firstName;
    private String secondName;
    private String group;
    private int course;
    private String faculty;

    public Student(String firstName, String secondName, String group, int course, String faculty) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.group = group;
        this.course = course;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return firstName + ' ' + secondName + " студент " +
                course + " курсу, групи " + group + " факультету " + faculty + '\n';
    }
}
