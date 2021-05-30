package kodlamaio.northwind.business.abstacts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concrete.Users;

public interface UsersService {
	
	DataResult<List<Users>> getAll();
	

}
