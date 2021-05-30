package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstacts.JobSeekersService;
import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.ErrorResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessDataResult;
import kodlamaio.northwind.core.utilities.result.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.JobSeekersDao;
import kodlamaio.northwind.entities.concrete.JobSeekers;
import kodlamaio.northwind.entities.concrete.dto.JobSeekersForRegisterDto;

@Service
public class JobSeekersManager implements JobSeekersService{

	private JobSeekersDao jobSeekersDao;
	
	@Autowired
	public JobSeekersManager(JobSeekersDao jobSeekersDao) {
		super();
		this.jobSeekersDao = jobSeekersDao;
	}

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeekers>>(jobSeekersDao.findAll(), "Tüm liste listelendi");
	}

	@Override
	public Result add(JobSeekers jobSeekers) {

		jobSeekersDao.save(jobSeekers);
		
		return new SuccessResult("İş arayan eklendi eklendi");
	}
	
	@Override
	public Result register(JobSeekersForRegisterDto jobSeeker) {
		
//		if(areAllFieldsFilled(jobSeeker).isSuccess() == false) {
//			
//			return new ErrorResult("Tüm alanlar doldurulmalıdır.");
//			
//		}if(isEmailExist(jobSeeker).isSuccess() == false) {
//			
//			return new ErrorResult("Bu e-posta adresi kullanılmaktadır.");
//			
//		}if(!isEmailFormat(jobSeeker.getEmail())) {
//			return new ErrorResult("E-postanız e-posta formatında olmalıdır.");
//		}
//		if(isIdentityExist(jobSeeker).isSuccess() == false) {
//			
//			return new ErrorResult("Bu kimlik numarası ile kullanıcı mevcut");
//			
//		}if(arePasswordsMatching(jobSeeker).isSuccess() == false) {
//			
//			return new ErrorResult("Şifreler uyuşmuyor.");
//			
//		}if(!this.mernisValidate(jobSeeker.getNationalityId(), jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getDateOfBirth().getYear()).isSuccess()){
//			
//			return new ErrorResult("Kimlik doğrulaması başarısız.");
//			
//		}
//		
//		
//		
//			User userToRegister = new User(jobSeeker.getEmail(),jobSeeker.getPassword(),false, UUID.randomUUID().toString());
//			
//			userService.add(userToRegister);
//			
//			JobSeekers jobSeekerToRegister = new JobSeeker(userToRegister.getId(),jobSeeker.getFirstName(),jobSeeker.
//					getLastName(),jobSeeker.getNationalityId(),jobSeeker.getDateOfBirth());
//			
//			jobSeekersDao.save(jobSeekerToRegister);
			
			return new SuccessResult("İş arayan kaydı başarılı. Lütfen e-posta adresinize gelen doğrulama kodunu giriniz.");
	}

//	@Override
//	public DataResult<List<JobSeekers>> getByEmail(String email) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<List<JobSeekers>>(jobSeekersDao.findByEmail(email));
//	}
//
//	@Override
//	public DataResult<List<JobSeekers>> getByNationalNumber(String nationalityNumber) {
//		// TODO Auto-generated method stub
//		return new SuccessDataResult<List<JobSeekers>>(jobSeekersDao.findByNationalityNumber(nationalityNumber));
//	}

	
	

}
