package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstacts.UsersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.UsersDao;
import kodlamaio.northwind.entities.concrete.Users;

@Service
public class UsersManager implements UsersService{

	private UsersDao userDao;
	
	@Autowired
	public UsersManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}


	@Override
	public DataResult<List<Users>> getAll() {

		
		return new SuccessDataResult<List<Users>>(userDao.findAll(), "Tüm liste listelendi");
	}

}
