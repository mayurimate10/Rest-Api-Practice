package net.mayuri.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : Mayuri Mate
 * Description : Rest API using Spring Boot, Spring Data JPA and Thymeleaf
 */

import net.mayuri.sms.entity.Student;
import net.mayuri.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Mayuri", "Mate", "MayuriM@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Gita", "Patil", "GitaPatil@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Sita", "Patil", "SitaP@gmail.com");
		 * studentRepository.save(student3);
		 */

	}

}
