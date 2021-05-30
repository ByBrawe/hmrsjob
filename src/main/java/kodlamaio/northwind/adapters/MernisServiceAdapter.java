package kodlamaio.northwind.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import kodlamaio.northwind.entities.concrete.dto.JobSeekersForRegisterDto;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements JobSeekerCheckService{
	
	
	@Override
	public boolean checkIfRealPerson(JobSeekersForRegisterDto jobSeeker) {
		System.out.println("x");
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		var result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(jobSeeker.getNationality_number()), 
					jobSeeker.getFirst_name().toUpperCase(new Locale("tr")), 
					jobSeeker.getLast_name().toUpperCase(new Locale("tr")),jobSeeker.getBirth_date().getYear());
			} catch (NumberFormatException e) {
				System.out.println("Lütfen kimlik numaranızı sayı formatında giriniz.");
			} catch (RemoteException e) {
				e.printStackTrace();
		}
		
		if(result) {
			System.out.println("Kimlik doğrulaması başarılı.");
		}else {
			System.out.println("Kimlik doğrulaması başarısız.");
			result = false;
		}
		
		return result;
		
	}
}
