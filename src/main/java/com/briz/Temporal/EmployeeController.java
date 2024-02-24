package com.briz.Temporal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class EmployeeController 
{
	@Autowired
	EmployeeRepository erepo;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee e)
	{
		return erepo.save(e);
	}
	
	@PostMapping("/saveall")
	public List<Employee> saveall(@RequestBody List<Employee>list)
	{
	return erepo.saveAll(list);
	}
	
	@GetMapping("/findall")
	public List<Employee>all()
	{
		return erepo.findAll();
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee e)
	{
		 return erepo.save(e);
	}

}
