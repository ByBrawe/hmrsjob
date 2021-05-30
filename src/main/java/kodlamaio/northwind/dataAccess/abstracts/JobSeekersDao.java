package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrete.JobSeekers;


public interface JobSeekersDao extends JpaRepository<JobSeekers, Integer>{
	
	
//	List<JobSeekers> findByEmail(String email);
//	List<JobSeekers> findByNationalityNumber(String nationalityNumber);

}
