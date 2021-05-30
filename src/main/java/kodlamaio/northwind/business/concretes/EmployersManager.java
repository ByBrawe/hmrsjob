package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.core.utilities.result.Result;

import kodlamaio.northwind.business.abstacts.EmployersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.EmployersDao;
import kodlamaio.northwind.entities.concrete.Employers;

@Service
public class EmployersManager implements EmployersService{

	
	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		super();
		this.employersDao = employersDao;
	}

	
	@Override
	public DataResult<List<Employers>> getAll() {

		
		return new SuccessDataResult<List<Employers>>(employersDao.findAll(), "Tüm liste listelendi");

		
	}

	@Override
	public Result add(Employers employers) {

		employersDao.save(employers);
		
		return new SuccessResult("New employers Added");
	}

//	@Override
//	public DataResult<List<Employers>> getByEmail(String email) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<List<Employers>>(employersDao.findByEmail(email));
//	}
//
//	@Override
//	public DataResult<Employers> getbyWebAddress(String website) {
//		
//		return new SuccessDataResult<Employers>(employersDao.findByWebsite(website));
//	}

	
}
