package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrete.SystemPersonnels;


public interface SystemPersonnelsDao extends JpaRepository<SystemPersonnels, Integer>{

}
