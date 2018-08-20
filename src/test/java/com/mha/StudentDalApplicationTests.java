package com.mha;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mha.entities.Student;
import com.mha.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentDalApplicationTests {

	
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setCourse("Spring Framework");
		student.setFee(30d);
		student.setName("Hassan");
		
		studentRepository.save(student);
		
	}
	
	@Test
	public void testFindStudentById() {
		System.out.println(studentRepository.findById(1l));
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(1l);
		Student st = student.get();
		st.setFee(100d);
		
		studentRepository.save(st);
	}
	
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1L);
	}

}
