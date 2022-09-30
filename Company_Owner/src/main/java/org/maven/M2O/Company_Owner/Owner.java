package org.maven.M2O.Company_Owner;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	@Id
	private int id;
	private String name;
	private long contact;
	private double turnOver;
	@OneToMany(mappedBy="owner")
	private List<Company> company=new ArrayList<>();
	

	public Owner() {
	}

	public Owner(int id, String name, long contact,double turnOver) {

		this.id = id;
		this.name = name;
		this.contact = contact;
	
		this.turnOver = turnOver;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", contact=" + contact + ", company=" + company + ", turnOver="
				+ turnOver + "]";
	}

}
