package com.dojoninjas.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table( name = "ninjas" )
public class Ninja {

	// DECLARE
	
	@Id
	//@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size( max = 100 )
	private String first_name;
	
	@NotNull
	@Size( max = 100 )
	private String last_name;
	
	@NotNull
	private int age;
	//@Column(=false)
	/*private Date created_at;
	private Date updated_at;
	
	@PrePersist
	protected void onCreate() {
		this.created_at = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updated_at = new Date();
	}
	*/
	// MANY TO ONE
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojos_id")
	private Dojo dojo;
	
	public Ninja() {
	}
	/*public Ninja( String first_name, String last_name, int age ) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
	}*/
	public Ninja( String first_name, String last_name, int age, Dojo dojo) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.dojo = dojo;
	}
	
	// GETTERS
	
	public Long getId() {
		return id;
	}
	public String getFirstName() {
		return first_name;
	}
	public String getLastName() {
		return last_name;
	}
	public int getAge() {
		return age;
	}
	/*public Date getCreated_at() {
		return created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}*/
	public Dojo getDojo() {
		return dojo;
	}
	
	// SETTER
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.first_name = firstName;
	}
	public void setLastName(String lastName) {
		this.last_name = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}*/
	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}

	
	
	
}
