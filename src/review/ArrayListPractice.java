package review;

import java.util.ArrayList;

// 학생 클래스
class Student {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

// 학생 관리 시스템 클래스
class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // 학생 추가
    public void addStudent(Student student) {
        students.add(student);
    }

    // 학생 삭제
    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    // 특정 조건에 맞는 학생 검색 (예: GPA가 특정 값 이상인 학생)
    public ArrayList<Student> findStudentsByGpa(double minGpa) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGpa() >= minGpa) {
                result.add(student);
            }
        }
        return result;
    }

    // 모든 학생 출력
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// 메인 클래스
public class ArrayListPractice {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        // 학생 추가
        sms.addStudent(new Student(1, "Alice", 3.5));
        sms.addStudent(new Student(2, "Bob", 3.8));
        sms.addStudent(new Student(3, "Charlie", 2.9));

        System.out.println("모든 학생 목록:");
        sms.printAllStudents();

        System.out.println("\nGPA가 3.0 이상인 학생:");
        ArrayList<Student> highGpaStudents = sms.findStudentsByGpa(3.0);
        for (Student student : highGpaStudents) {
            System.out.println(student);
        }

        // 학생 삭제
        sms.removeStudent(2);

        System.out.println("\n학생 삭제 후 모든 학생 목록:");
        sms.printAllStudents();
    }
}