package com.dmdev.cs.homework6;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MappingFunction {

    List<Student> students = new ArrayList<>();

    static final BinaryOperator<Student> mergeFunction =
            (p1, p2) -> {
                List<Integer> marks = p1.getMarks();
                marks.addAll(p2.getMarks());
                return p1;
            };

    static final Function<Student, Double> mapFunction = p -> {
        AtomicReference<Double> result = new AtomicReference<>(0D);
        p.getMarks().stream().mapToInt(x -> x)
                .average()
                .ifPresent(result::set);
        return result.get();
    };

    public static void getAverageMarks(List<Student> students) {
        Map<Integer, Double> averageMarks = students.stream()
                .filter(p -> p.getMarks().size() > 3)
                .collect(Collectors.groupingBy(Student::getNumberOfCourse,
                        Collectors.collectingAndThen(
                                Collectors.collectingAndThen(
                                        Collectors.reducing(mergeFunction),
                                        Optional::get),
                                mapFunction)));
        System.out.println("\n" + averageMarks);
    }

    public static void getStudentListByFullName(List<Student> students) {
        final Function<Student, Student> mapFunction2 = p -> new Student(p.getFirstName(), p.getLastName());

        Map<Integer, List<Student>> studentList = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.groupingBy(Student::getNumberOfCourse,
                        Collectors.collectingAndThen(
                                Collectors.mapping(mapFunction2, Collectors.toList()),
                                x -> x)
                ));
        System.out.println("\n" + studentList);
    }
    
    public static void getStudentListByCourseAndTwoParameters(List<Student> students) {
        final Function<Student, Student> mapFunction3 = p -> {
            p.setNumberOfCourse(null);
            return p;
        };

        final Function<List<Student>, SortedStudent> mapFunction4 = p -> {
            double averageMark = p.stream().map(Student::getMarks).reduce(new ArrayList<>(), (p1, p2) -> {
                        p1.addAll(p2);
                        return p1;
                    }).stream().mapToInt(x -> x)
                    .average()
                    .orElse(0);

            SortedStudent sortedStudent = new SortedStudent(p, averageMark);
            p.forEach(it -> it.setMarks(Collections.emptyList()));
            return sortedStudent;
        };

        Map<Integer, SortedStudent> studentList = students.stream()
                .sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName))
                .collect(Collectors.groupingBy(Student::getNumberOfCourse,
                        Collectors.collectingAndThen(
                                Collectors.mapping(mapFunction3, Collectors.toList()),
                                mapFunction4
                        )));
        System.out.println("\n" + studentList);
    }

}
