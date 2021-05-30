package kodlamaio.northwind.adapters;

import kodlamaio.northwind.entities.concrete.dto.JobSeekersForRegisterDto;

public interface JobSeekerCheckService {
	boolean checkIfRealPerson(JobSeekersForRegisterDto jobSeeker);

}
