package com.cts.eschool;

import com.cts.eschool.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EschoolApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ss = SpringApplication.run(EschoolApplication.class, args);

		StudentService s = ss.getBean(StudentService.class);
		s.addNewStudentDetail(1, "Ruchi", 76);
		s.addNewStudentDetail(2, "Anjali", 48);
		s.addNewStudentDetail(3, "Abhishek", 95);

		s.getAllStudentDetails();
		s.getStudentDetailsById(2);
		s.updateStudentScore(1,60.8);
		s.deleteStudentDetails(2);
		s.getAllStudentDetails();
	}

}
