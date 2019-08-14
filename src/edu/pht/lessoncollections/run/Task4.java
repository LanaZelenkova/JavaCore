package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Student;
import edu.pht.lessoncollections.util.studentutil.StudentUtil;

import java.util.Arrays;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Student[] students = StudentUtil.generate(14);
        TreeSet<Student> setOfStudents = new TreeSet<>(Arrays.asList(students));
        StudentUtil.print(setOfStudents);
        System.out.println("_________________________________________________________________________________________");
        StudentUtil.outputIfCondition(setOfStudents);
        System.out.println("_________________________________________________________________________________________");
        setOfStudents.removeIf(m -> m.getId() % 2 != 0);
        StudentUtil.print(setOfStudents);
    }
}
