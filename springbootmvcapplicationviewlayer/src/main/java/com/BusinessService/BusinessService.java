package com.BusinessService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Repository.EmployeeRepository;
import com.beans.Employee;

@Service
public class BusinessService {

	@Autowired
	private EmployeeRepository emprepo;
	
	public Employee addEmployee(Employee e)
	{
		return emprepo.save(e);
	}
	
	public List<Employee> getAllEmployee()
	{
		return emprepo.findAll();
	}
	
	public Employee getEmpByID(int id)
	{
		return emprepo.findById(id).orElse(null);
	}
	
	public void deleteById(int id)
	{
		emprepo.deleteById(id);
	}
	
	
}
