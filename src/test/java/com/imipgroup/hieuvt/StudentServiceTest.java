package com.imipgroup.hieuvt;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:test-mvc.xml")
public class StudentServiceTest extends TestCase {

    @Autowired
    StudentService studentService;

//    @Override
//    protected void setUp() throws Exception {
//        studentService = new StudentService();
//    }

    @Test
    public void testGetAllStudents() throws Exception {
        List<Student> students = studentService.getAllStudents();

//        System.out.println(studentService);
    }
}