package org.hibernate.example;

import org.hibernate.example.dao.StudentDAO;
import org.hibernate.example.entity.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student("joe","hart", "joehart@gmail.com");
        studentDAO.saveStudent(student);

        System.out.println(student.getId());
    }
}
