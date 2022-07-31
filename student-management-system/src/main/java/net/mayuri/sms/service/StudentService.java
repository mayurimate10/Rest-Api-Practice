package net.mayuri.sms.service;

import java.util.List;

import net.mayuri.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
}
