package com.mha;

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
	public void contextLoads() {
		Student student = new Student();
		student.setCourse("Spring Framework");
		student.setFee(30d);
		student.setName("Hassan");
		
		studentRepository.save(student);
		
	}

}
