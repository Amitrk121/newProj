package org.maven.M2O.Company_Owner;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Company {
	@Id
	private int regNo;
	private String cName;
	private String department;
	private int no_Of_Emp;
	@Embedded
	private Location locations;
	@ManyToOne
	private Owner owner;

	public Company() {

	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Location getLocations() {
		return locations;
	}

	public void setLocations(Location locations) {
		this.locations = locations;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public int getNo_Of_Emp() {
		return no_Of_Emp;
	}

	public void setNo_Of_Emp(int no_Of_Emp) {
		this.no_Of_Emp = no_Of_Emp;
	}

	@Override
	public String toString() {
		return "Company [regNo=" + regNo + ", cName=" + cName + ", department=" + department + ", locations="
				+ locations + ", owner=" + owner + ", no_Of_Emp=" + no_Of_Emp + "]";
	}
	//Comment1
	//comment2
}
