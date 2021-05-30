package kodlamaio.northwind.core.utilities.helper;

import kodlamaio.northwind.core.utilities.result.Result;

public interface EmailService {
	
	Result send(String to, String message);

}
