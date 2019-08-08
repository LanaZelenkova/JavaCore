package edu.pht.lessoncollections.util.studentutil;

import edu.pht.lessoncollections.domain.Book;
import edu.pht.lessoncollections.domain.Student;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

public class StudentUtil {

    public static int id = 0;
    public static int defaulCountName = 3;
    public static int min = 2;
    public static int max = 7;
    public static int yearMin = 17;
    public static int yearMax = 75;

    public static Student[] generate(int count) {
        Student[] result = new Student[count];
        for (int i = 0; i < count; i++) {
            Student student = new Student();
            student.setId(++id);
            student.setName(randomName(defaulCountName));
            student.setAge(randomInt());
            result[i] = student;
        }
        return result;
    }
    private static String randomName(int countNames) {
        String name = "";
        for (int i = 0; i < countNames; i++) {
            name += StringUtils.capitalize(RandomStringUtils.randomAlphabetic(min, max).toLowerCase()) + " ";
        }
        return name;
    }
    private static int randomInt() {
        return RandomUtils.nextInt(yearMin, yearMax);
    }
    public static void print(Collection<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void sort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (students[j - 1].compareTo(students[j]) > 0) {
                    Student temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }
}
