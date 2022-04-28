package org.launchcode.java.demos.lsn3classes1.school;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String name;

    private ArrayList<Student> students;

    private int worthNumberOfCredits;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", worthNumberOfCredits=" + worthNumberOfCredits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
