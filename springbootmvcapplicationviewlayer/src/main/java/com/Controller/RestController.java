package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BusinessService.BusinessService;
import com.beans.Employee;

@CrossOrigin("*")
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/employee")
public class RestController {
	
	@Autowired
	private BusinessService service;
	
	@PostMapping
	public Employee addEmp(@RequestBody Employee e)
	{
		return service.addEmployee(e);
	}
	
	@GetMapping("/All")
	public List<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
	@GetMapping("/{id}")
	public Employee getEmpid(@PathVariable int id)
	{
		return service.getEmpByID(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteEmp(@PathVariable int id)
	{
		service.deleteById(id);
		return "Record are deleted";
	}
	
	@PutMapping("/{id}")
	public String updateById(@PathVariable int id,@RequestBody Employee emp)
	{
		emp.setId(id);
		service.addEmployee(emp);
		
		
		return "Update the Record";
	}

}
