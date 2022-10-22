package com.pranav.crudapi.service;

import com.pranav.crudapi.Studentmodel.StudentData;

import java.util.List;

public interface StudentCrudOperation {
    StudentData createStudent(StudentData student);
    StudentData updateStudent(StudentData student);
    List<StudentData> getAllStudent();
    StudentData getStudentById(long universityRoll);
    void deleteStudent(long universityRoll);
}
