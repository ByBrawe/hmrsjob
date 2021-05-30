package kodlamaio.northwind.business.abstacts;

import java.util.List;


import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concrete.JobSeekers;
import kodlamaio.northwind.entities.concrete.dto.JobSeekersForRegisterDto;

public interface JobSeekersService {
	
	DataResult<List<JobSeekers>> getAll();
	Result add(JobSeekers jobSeekers);
//	DataResult<List<JobSeekers>> getByEmail(String email);
//	DataResult<List<JobSeekers>> getByNationalNumber(String nationalityNumber);
	Result register(JobSeekersForRegisterDto jobSeeker);


}
