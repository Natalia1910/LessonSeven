package com.lits;

import com.lits.config.JavaConfig;
import com.lits.entity.Course;
import com.lits.entity.Teacher;
import com.lits.service.CourseService;
import com.lits.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        TeacherService teacherService = context.getBean(TeacherService.class);
        teacherService.add(new Teacher("Ivan", "Ivanov"));
        teacherService.add(new Teacher("Masha", "Petrova"));
        teacherService.add(new Teacher("Valera", "Valerovich"));

        teacherService.getAllTeachers();

       // teacherService.removeTeacher(2);

        CourseService courseService = context.getBean(CourseService.class);
        //courseService.add(new Course("Psychology"));

    }
}
