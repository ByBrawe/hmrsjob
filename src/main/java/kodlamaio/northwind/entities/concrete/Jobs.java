package kodlamaio.northwind.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name= "job_names")
public class Jobs {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_name")
	private String job_name;
	
	public Jobs() {
		
		
	}

	public Jobs(int id, String job_name) {
		super();
		this.id = id;
		this.job_name = job_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}



	
}
