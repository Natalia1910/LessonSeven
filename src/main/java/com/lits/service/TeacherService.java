package com.lits.service;

import com.lits.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;

@Component
public class TeacherService {
    @Autowired
    private EntityManagerFactory em;

    public void add (Teacher teacher){

    }
}
