package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrete.Employers;

public interface EmployersDao extends JpaRepository<Employers, Integer>{
	
//	List<Employers> findByEmail(String email);
//	Employers findByWebsite (String website);

}
