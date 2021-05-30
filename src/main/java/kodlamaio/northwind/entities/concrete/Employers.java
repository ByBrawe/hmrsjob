package kodlamaio.northwind.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "employers")
public class Employers {
	
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="website")
	private String website;
	
	@Column(name="phone_number")
	private String phone_number;
	
	public Employers() {
		// TODO Auto-generated constructor stub
	}

	public Employers(String company_name, String website, String phone_number, int id) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.website = website;
		this.phone_number = phone_number;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
}
