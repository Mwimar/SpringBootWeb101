package com.mwimar.SpringBootWeb101;

import com.mwimar.SpringBootWeb101.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootWeb101Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWeb101Application.class, args);
		Student student = context.getBean(Student.class);
	}

}
