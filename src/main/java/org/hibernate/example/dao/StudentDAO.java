package org.hibernate.example.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.example.entity.Student;
import org.hibernate.example.util.HibernateUtil;

import java.util.List;

public class StudentDAO {
    public void saveStudent(Student student){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();


        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

}
