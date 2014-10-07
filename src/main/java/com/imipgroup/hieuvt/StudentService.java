package com.imipgroup.hieuvt;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 10/7/2014.
 */

@Service("StudentService")
public class StudentService {

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<Student>();

        Student student = new Student();
        student.setName("Rockey");
        students.add(student);

        student = new Student();
        student.setName("Jose");
        students.add(student);

        return students;
    }
}
