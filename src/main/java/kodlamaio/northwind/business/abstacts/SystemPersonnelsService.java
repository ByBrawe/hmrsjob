package kodlamaio.northwind.business.abstacts;

import java.util.List;

import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.entities.concrete.SystemPersonnels;

public interface SystemPersonnelsService {
	
	DataResult<List<SystemPersonnels>> getAll();
	Result add(SystemPersonnels systemPersonnels);
	

}
