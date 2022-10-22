package com.pranav.crudapi.service;

import com.pranav.crudapi.Repo.StudentRepo;
import com.pranav.crudapi.Studentmodel.StudentData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentDataImpl implements StudentCrudOperation{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public StudentData createStudent(StudentData student) {
        return studentRepo.save(student);
    }

    @Override
    public StudentData updateStudent(StudentData student) {
        Optional<StudentData> StudentDataBase = this.studentRepo.findById(student.getUniversityRoll());
        if(StudentDataBase.isPresent()) {
            StudentData studentUpdate = StudentDataBase.get();
            studentUpdate.setUniversityRoll(student.getUniversityRoll());
            studentUpdate.setName(student.getName());
            studentUpdate.setYear(student.getYear());
            studentUpdate.setBranch(student.getBranch());
            studentUpdate.setAge(student.getAge());
            studentRepo.save(studentUpdate);
            return studentUpdate;
        }
        else{
            return null;
        }
    }

    @Override
    public List<StudentData> getAllStudent() {
        return this.studentRepo.findAll();
    }

    @Override
    public StudentData getStudentById(long universityRoll) {
        Optional<StudentData> StudentDataBase = this.studentRepo.findById(universityRoll);
        if(StudentDataBase.isPresent()){
            return StudentDataBase.get();
        }
        else{
            return null;
        }
    }

    @Override
    public void deleteStudent(long universityRoll) {
        Optional<StudentData> StudentDataBase = this.studentRepo.findById(universityRoll);
        if(StudentDataBase.isPresent()){
            this.studentRepo.delete(StudentDataBase.get());
        }
    }
}
