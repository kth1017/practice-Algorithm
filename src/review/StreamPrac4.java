package review;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPrac4 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", 85),
                new Student("Jane", 92),
                new Student("Jack", 77),
                new Student("Jill", 89)
        );

        List<Student> topStudents = students.stream()
                .filter(student -> student.getScore() >= 80)
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .collect(Collectors.toList());

        topStudents.forEach(System.out::println);
}

static class Student {
        private String name;
        private int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', score=" + score + '}';
        }

    }
}
