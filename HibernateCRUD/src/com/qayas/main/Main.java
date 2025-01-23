package com.qayas.main;

import com.qayas.main.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static Session session;
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        saveStudent();
        System.out.println(getStudent(2));
        updateStudent(2);
        System.out.println(getStudent(2));
        deleteStudent(5);
        session.getTransaction().commit();

    }
    public static void saveStudent() {
        session.save(new Student("Ahmed", "Mansoura"));
    }

    public static Student getStudent(int id) {
        return session.get(Student.class, id);
    }
    public static void updateStudent(int id) {
        Student student = getStudent(id);
        student.setAddress("Alex");
        session.update(student);
    }
    public static void deleteStudent(int id) {
        Student student = getStudent(id);
        session.delete(student);
    }
}