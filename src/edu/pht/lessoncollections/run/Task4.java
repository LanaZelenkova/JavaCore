package edu.pht.lessoncollections.run;

import edu.pht.lessoncollections.domain.Student;
import edu.pht.lessoncollections.util.studentutil.StudentUtil;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        Student[] students = StudentUtil.generate(14);
        TreeSet<Student> setOfStudents = new TreeSet<>(Arrays.asList(students));
        StudentUtil.print(setOfStudents);
        System.out.println("_________________________________________________________________________________________");
        Iterator<Student> it = setOfStudents.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            if (student.getId() % 2 == 0) {
                System.out.println(student);
            }
        }
        System.out.println("_________________________________________________________________________________________");
        setOfStudents.removeIf(m -> m.getId() % 2 != 0);
        StudentUtil.print(setOfStudents);
    }
}
