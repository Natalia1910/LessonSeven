package com.lits.service;

import com.lits.entity.Teacher;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class TeacherService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void add(Teacher teacher) {
        entityManager.persist(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return entityManager.createQuery("SELECT t FROM Teacher t").getResultList();
    }

    @Transactional
    public void removeTeacher(int id) {
        entityManager.remove(entityManager.find(Teacher.class, id));
    }
}
