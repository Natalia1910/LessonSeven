package com.lits.service;

import com.lits.entity.Course;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class CourseService {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void add(Course course) {
        entityManager.persist(course);
    }

    public List<Course> getAllCourses() {
        return entityManager.createQuery("SELECT c FROM Course c").getResultList();
    }

    @Transactional
    public void removeCourse(int courseId) {
        entityManager.remove(entityManager.find(Course.class, courseId));
    }
}

