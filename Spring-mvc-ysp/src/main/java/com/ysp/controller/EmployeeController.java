package com.ysp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ysp.Entity.Employee;
import com.ysp.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping("/add-emp")
	public String add(@RequestParam String firstName,
				@RequestParam String lastName,
				@RequestParam int age,
				Map map
			) {
	Employee employee = new Employee();
	employee.setFirstName(firstName);
	employee.setLastName(lastName);
	employee.setAge(age);
	employeeRepository.save(employee);
	
	map.put("message", "Your details Added Successfully");
	return "viewEmp.jsp";
	
	}
	
	@RequestMapping("addEmp-v2")
	public String addEMp(Employee emp,Map map) {
		employeeRepository.save(emp);
		map.put("message",  emp.getFirstName() + " Your details added Successfully");
		return "viewEmpv2.jsp";
		
	}
	
	@RequestMapping("/all-emp")
	public String fetchAllEmployee(Map map) {
	List<Employee> list	=(List<Employee>) employeeRepository.findAll();
		map.put("AllEmp",list);
		return "ViewAllEmp.jsp";
	}
	
	
	
	
	
}

