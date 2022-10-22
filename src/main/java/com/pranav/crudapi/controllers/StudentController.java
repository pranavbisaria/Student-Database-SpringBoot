package com.pranav.crudapi.controllers;

import com.pranav.crudapi.Studentmodel.StudentData;
import com.pranav.crudapi.service.StudentCrudOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentCrudOperation studentCrudOperation;

    @GetMapping("/student")
    public ResponseEntity<List<StudentData>> getAllStudent(){
        return ResponseEntity.ok().body(studentCrudOperation.getAllStudent());
    }
    @GetMapping("/student/{id}")
    public ResponseEntity<StudentData> getStudentById(@PathVariable long id ){
        return ResponseEntity.ok().body(studentCrudOperation.getStudentById(id));
    }

    @PostMapping("/student")
    public ResponseEntity<StudentData> createStudent(@RequestBody StudentData studentData){
        return ResponseEntity.ok().body(this.studentCrudOperation.createStudent(studentData));
    }
    @PutMapping("/student/{id}")
    public ResponseEntity<StudentData> updateStudent(@PathVariable long id, @RequestBody StudentData studentData){
        studentData.setUniversityRoll(id);
        return ResponseEntity.ok().body(this.studentCrudOperation.updateStudent(studentData));
    }

    @DeleteMapping("/student/{id}")
    public HttpStatus deleteStudent(@PathVariable long id){
        this.studentCrudOperation.deleteStudent(id);
        return HttpStatus.OK;
    }
}
