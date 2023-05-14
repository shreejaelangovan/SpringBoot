package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
    private StudentRepo studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }
    public boolean createStudent(Student student) {
        return studentRepository.save(student) != null? true:false;
    }
    public Student updateStudent(Integer id, Student student) {
        Student stu = studentRepository.findById(id).get();
        stu.setName(student.getName());
        stu.setAge(student.getAge());
        stu.setAddress(student.getAddress());
        stu.setDepartment(student.getDepartment());
      return studentRepository.save(stu);
    }
    public boolean deleteStudent(Integer id) {
        if(studentRepository.findById(id).isPresent()){
            studentRepository.deleteById(id);
          return true; } 
        return false;
    }

}

