package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concrete.Users;


public interface UsersDao extends JpaRepository<Users, Integer>{

}
