package com.genspark.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

@Configuration
public class EmployeeConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            Employee zulia = new Employee(
                    "Zulia",
                    "zulia@gmail.com",
                    LocalDate.of(2003, Month.MARCH, 01)

            );

            employeeRepository.save(zulia);
        };
    }
}