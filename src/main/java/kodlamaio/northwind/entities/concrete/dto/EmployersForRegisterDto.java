package kodlamaio.northwind.entities.concrete.dto;

public class EmployersForRegisterDto {
	
	private String company_name;
	private String website;
	private String phone_number;
	private String email;
	private String password;
	private String verifypassword;

	public EmployersForRegisterDto() {
		// TODO Auto-generated constructor stub
	}

	public EmployersForRegisterDto(String company_name, String website, String phone_number, String email,
			String password, String verifypassword) {
		super();
		this.company_name = company_name;
		this.website = website;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
		this.verifypassword = verifypassword;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifypassword() {
		return verifypassword;
	}

	public void setVerifypassword(String verifypassword) {
		this.verifypassword = verifypassword;
	}
	
	
}
