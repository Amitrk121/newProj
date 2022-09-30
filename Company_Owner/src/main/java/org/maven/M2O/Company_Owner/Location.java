package org.maven.M2O.Company_Owner;

import javax.persistence.Embeddable;

@Embeddable
public class Location {
	private String city;
	private String state;
	private String country;
	private int pincode;
	public Location() {
		
	}
	public Location(String city, String state, String country, int pincode) {
		
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

}
