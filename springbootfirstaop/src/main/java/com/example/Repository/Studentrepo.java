package com.example.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {

	Student finById(int id);

}
