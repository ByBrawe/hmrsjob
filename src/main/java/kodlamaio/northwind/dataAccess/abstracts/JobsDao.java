package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrete.Jobs;

public interface JobsDao extends JpaRepository<Jobs, Integer>{

	
	
	
}
