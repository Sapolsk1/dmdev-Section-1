package com.dmdev.cs.homework6;

import java.util.List;
import java.util.Objects;

public class SortedStudent {

    private List<Student> students;
    private Double averageMark;

    public SortedStudent(List<Student> students, Double averageMark) {
        this.students = students;
        this.averageMark = averageMark;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortedStudent that = (SortedStudent) o;
        return Objects.equals(students, that.students) && Objects.equals(averageMark, that.averageMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students, averageMark);
    }

    @Override
    public String toString() {
        return " SortedStudent {" +
                "\nnames=" + students +
                ",\naverageMark=" + averageMark +
                '}';
    }

}
