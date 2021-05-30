package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstacts.JobSeekersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concrete.JobSeekers;
import kodlamaio.northwind.entities.concrete.dto.JobSeekersForRegisterDto;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekersController {
	
	private JobSeekersService jobSeekersService;

	public JobSeekersController(JobSeekersService jobSeekersService) {
		super();
		this.jobSeekersService = jobSeekersService;
	}
	

	@GetMapping("/getall")
	public DataResult<List<JobSeekers>> getAll(){
		
		return jobSeekersService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobSeekers jobSeekers) {
		
		return jobSeekersService.add(jobSeekers);
	}
	
	@PostMapping("/register")
	public Result register(@RequestBody JobSeekersForRegisterDto jobSeeker) {
		return this.jobSeekersService.register(jobSeeker);
	}
	
}
