package org.launchcode.java.demos.lsn3classes1.school;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {
    public static void main(String[] args) {
        Student myself = new Student("Lucas",1,1,4.0);
        Student twin = new Student("Lucas",2,2,2.0);
        Teacher theTeacher = new Teacher();
        String myGradeLevel = myself.getGradeLevel();
        System.out.println(myGradeLevel);
        myself.addGrade(3,3.0);
        System.out.println(myself.gpa);
        System.out.println(myself.toString());
        System.out.println(myself.equals(twin));
    }


    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;
    public Student(String name, int studentId, int numberOfCredits, double gpa ) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public String studentInfo() {
        return (this.name + "has a GPA of: " + this.gpa);
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;
        double newQualityScore = grade * courseCredits;
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >= 0 && this.numberOfCredits <=29) {
            return "Freshman";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <= 89) {
            return "Junior";
        } else if(this.numberOfCredits >= 90){
            return "Senior";
        } else {
            return null;
        }

    }


    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public int getStudentId() { return this.studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }
    public int getNumberOfCredits() { return this.numberOfCredits; }
    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }
    public double getGpa() { return this.gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
