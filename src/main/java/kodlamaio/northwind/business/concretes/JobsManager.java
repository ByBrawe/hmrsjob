package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstacts.JobsService;
import kodlamaio.northwind.entities.concrete.Jobs;
import kodlamaio.northwind.dataAccess.abstracts.JobsDao;


@Service
public class JobsManager implements JobsService{

	
	private JobsDao jobsDao;
	
	@Autowired
	public JobsManager(JobsDao jobsDao) {
		super();
		this.jobsDao = jobsDao;
	}


	@Override
	public List<Jobs> getAll() {

		return this.jobsDao.findAll();
	}

}
