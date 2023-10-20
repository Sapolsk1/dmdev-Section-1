package com.dmdev.cs.homework6;

import java.util.ArrayList;
import java.util.List;

import static com.dmdev.cs.homework6.MappingFunction.*;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 * <p>
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 * <p>
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 * <p>
 * Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap
 */
public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Balde", 3, getMarks(4, 5, 6, 4)));
        students.add(new Student("Marc", "Ter Stegen", 1, getMarks(3, 5, 7)));
        students.add(new Student("Ronald", "Araujo", 4, getMarks(6, 1, 9, 5)));
        students.add(new Student("Jule", "Kounde", 5, getMarks(1, 2, 3)));
        students.add(new Student("Joao", "Cancelo", 2, getMarks(5, 5, 5)));
        students.add(new Student("Frenkie", "De Jong", 5, getMarks(10, 10, 10, 9)));
        getAverageMarks(students);
        getStudentListByFullName(students);
        getStudentListByCourseAndTwoParameters(students);
    }

    public static List<Integer> getMarks(int... marks) {
        List<Integer> markList = new ArrayList<>();
        for (int mark : marks) {
            markList.add(mark);
        }
        return markList;
    }
}
