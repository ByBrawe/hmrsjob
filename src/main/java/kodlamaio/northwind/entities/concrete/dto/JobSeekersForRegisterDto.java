package kodlamaio.northwind.entities.concrete.dto;

import java.util.Date;

public class JobSeekersForRegisterDto {

	private String first_name;
	private String last_name;
	private String nationality_number;
	private Date birth_date;
	private String phone_number;
	private String email;
	private String password;
	private String verifypassword;
	
	public JobSeekersForRegisterDto() {
		// TODO Auto-generated constructor stub
	}
	
	public JobSeekersForRegisterDto(String first_name, String last_name, String nationality_number, Date birth_date,
			String phone_number, String email, String password, String verifypassword) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.nationality_number = nationality_number;
		this.birth_date = birth_date;
		this.phone_number = phone_number;
		this.email = email;
		this.password = password;
		this.verifypassword = verifypassword;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNationality_number() {
		return nationality_number;
	}

	public void setNationality_number(String nationality_number) {
		this.nationality_number = nationality_number;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
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
