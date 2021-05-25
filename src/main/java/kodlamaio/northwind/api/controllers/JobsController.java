package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstacts.JobsService;
import kodlamaio.northwind.entities.concrete.Jobs;

@RestController
@RequestMapping("/api/jobsnames")
public class JobsController {
	
	private JobsService jobsService;

	public JobsController(JobsService jobsService) {
		super();
		this.jobsService = jobsService;
	}
	
	// jobmanagerdaki getall ı getiriyorlar
	@GetMapping("/getall")
	public List<Jobs> getAll(){
		
		
		return this.jobsService.getAll();
		
	}
	

}
