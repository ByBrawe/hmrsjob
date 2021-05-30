package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.core.utilities.result.Result;

import kodlamaio.northwind.business.abstacts.EmployersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concrete.Employers;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployersService employersService;

	public EmployersController(EmployersService employersService) {
		super();
		this.employersService = employersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employers>> getAll() {
		
		return employersService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employers employers) {
		
		return employersService.add(employers);
		
		
	}
	
}
