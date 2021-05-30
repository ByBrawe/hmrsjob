package kodlamaio.northwind.core.utilities.helper;

import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.core.utilities.result.SuccessResult;

public class EmailManager implements EmailService{

	@Override
	public Result send(String to, String message) {

		return new SuccessResult("Doğrulama kodu gönderildi.");
	}

}
