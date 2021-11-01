package com.dojoninjas.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="dojos")
public class Dojo {
	
	// DECLARE
	
	@Id
	//@NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dojos_id;
	
	@NotNull
	@Size( max = 100 )
	private String dojos_name;
	
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
	// ONE TO MANY
	
	@OneToMany(mappedBy="dojo", fetch=FetchType.LAZY)
	private List<Ninja> ninjas;
	
	// CONSTRUCTOR
	
	public Dojo() {
		// EMPTY CONSTRUCTOR
	}
	public Dojo( String dojos_name ) {
		this.dojos_name = dojos_name;
	}
	public Dojo( Long dojos_id, String dojos_name ) {
		this.dojos_id = dojos_id;
		this.dojos_name = dojos_name;
	}
	
	// GETTERS
	
	public Long getId() {
		return dojos_id;
	}
	public String getDojos_name() {
		return dojos_name;
	}
	/*public Date getCreated_at() {
		return created_at;
	}
	public Date getUpdated_at() {
		return updated_at;
	}*/
	
	public List<Ninja> getNinjas() {
		return ninjas;
	}
	
	// SETTERS
	
	public void setId(Long dojos_id) {
		this.dojos_id = dojos_id;
	}
	public void setDojos_name(String dojos_name) {
		this.dojos_name = dojos_name;
	}
	/*public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}*/
	
	public void setNinjas(List<Ninja> ninjas) {
		this.ninjas = ninjas;
	}
	
	
}
