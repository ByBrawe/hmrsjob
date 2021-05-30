package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstacts.UsersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concrete.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UsersService usersService;

	
	public UsersController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){
		
		return usersService.getAll();
		
	}
	
}
