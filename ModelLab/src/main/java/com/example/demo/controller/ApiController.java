package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@RestController
//@RequestMapping("/students")
public class ApiController {
	@Autowired
	private StudentService studentService; 
	@GetMapping("/")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
	@GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }
	@PostMapping("/")
    public boolean createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @PutMapping("/{id}")
    public Student updateStudent( @RequestBody Student student,@PathVariable Integer id) {
        return studentService.updateStudent(id, student);
    }
    @DeleteMapping("/{id}")
    public boolean deleteStudent(@PathVariable Integer id) {
       return studentService.deleteStudent(id);
    }

}
