package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	//no Implement the interface
	//it provide the already made method provide
}

//save,findall(),findById
