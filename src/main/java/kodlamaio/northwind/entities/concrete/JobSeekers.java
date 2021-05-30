package kodlamaio.northwind.entities.concrete;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name= "job_seekers")
@PrimaryKeyJoinColumn(name="user_id")
public class JobSeekers {
	
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "first_name")
	private String first_name;
	
	
	@Column(name = "last_name")
	private String last_name;
	
	
	@Column(name = "nationality_number")
	private String nationality_number;
	
	
	@Column(name = "birth_date")
	private Date birth_date;

	public JobSeekers() {
		// TODO Auto-generated constructor stub
	}

	public JobSeekers(String first_name, String last_name, String nationality_number, Date birth_date , int id) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.nationality_number = nationality_number;
		this.birth_date = birth_date;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	

}
