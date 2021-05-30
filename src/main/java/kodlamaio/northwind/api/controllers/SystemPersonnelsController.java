package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstacts.SystemPersonnelsService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concrete.SystemPersonnels;

@RestController
@RequestMapping("/api/systempersonnel")
public class SystemPersonnelsController {
	
	private SystemPersonnelsService systemPersonnelsService;

	public SystemPersonnelsController(SystemPersonnelsService systemPersonnelsService) {
		super();
		this.systemPersonnelsService = systemPersonnelsService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<SystemPersonnels>> getAll(){
		
		return systemPersonnelsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SystemPersonnels systemPersonnels) {
		
		
		return systemPersonnelsService.add(systemPersonnels);
		
	}
	
	

}
