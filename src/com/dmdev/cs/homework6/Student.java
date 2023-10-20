package com.dmdev.cs.homework6;

import java.util.List;
import java.util.Objects;

/**
 *  * Дан список студентов с полями:
 *  * - Имя
 *  * - Фамилия
 *  * - Номер курса в университете
 *  * - Список оценок за учебу
 */
public class Student {

    private String firstName;
    private String lastName;
    private Integer numberOfCourse;
    private List<Integer> marks;

    public Student(String firstName, String lastName, int numberOfCourse, List<Integer> listOfBalls) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfCourse = numberOfCourse;
        this.marks = listOfBalls;
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNumberOfCourse(Integer numberOfCourse) {
        this.numberOfCourse = numberOfCourse;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\nStudent {" +
                "\nfirstName='" + firstName + '\'' +
                ",\nlastName='" + lastName + '\'' +
                ",\nnumberOfCourse=" + numberOfCourse +
                ",\nmarks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberOfCourse == student.numberOfCourse && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, numberOfCourse, marks);
    }
}
