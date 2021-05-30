package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstacts.SystemPersonnelsService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.SystemPersonnelsDao;
import kodlamaio.northwind.entities.concrete.SystemPersonnels;


@Service
public class SystemPersennelsManager implements SystemPersonnelsService{

	private SystemPersonnelsDao systemPersonnelsDao;
	
	@Autowired
	public SystemPersennelsManager(SystemPersonnelsDao systemPersonnelsDao) {
		super();
		this.systemPersonnelsDao = systemPersonnelsDao;
	}

	@Override
	public DataResult<List<SystemPersonnels>> getAll() {


		return new SuccessDataResult<List<SystemPersonnels>>(systemPersonnelsDao.findAll(), "Tüm liste listelendi");
	}

	@Override
	public Result add(SystemPersonnels systemPersonnels) {
		
		systemPersonnelsDao.save(systemPersonnels);
		
		return new SuccessResult("Personel eklendi");
	}

}
