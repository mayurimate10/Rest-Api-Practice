package net.mayuri.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.mayuri.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
