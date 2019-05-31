package com.example.gcpdemo1.bo;





import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class Person {

	@Id
	private Long id;
	private String name;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Person()
	{
		
	}
	
	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	
	
	
	
}
