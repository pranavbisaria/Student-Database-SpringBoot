package com.pranav.crudapi.Repo;

import com.pranav.crudapi.Studentmodel.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentData, Long> {
}
