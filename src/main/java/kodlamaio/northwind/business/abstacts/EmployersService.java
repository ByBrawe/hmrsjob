package kodlamaio.northwind.business.abstacts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concrete.Employers;

public interface EmployersService {
	
	DataResult<List<Employers>> getAll();
	Result add(Employers employers);
//	DataResult<List<Employers>> getByEmail(String email);
//	DataResult<Employers> getbyWebAddress(String website);


}
