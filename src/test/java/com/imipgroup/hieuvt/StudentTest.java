package com.imipgroup.hieuvt;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

    Student student;

    @Override
    protected void setUp() throws Exception {
        student = new Student();
    }

    public void testGetName() throws Exception {
        student.setName("Hieu");
        assertEquals("Hieu", student.getName());
    }

    public void testSetName() throws Exception {
        student.setName("Hieu");
        assertNotNull(student.getName());
    }

    public void testToString() throws Exception {
        student.setName("Hieu");
        assertEquals("Hieu", student.toString());
    }
}