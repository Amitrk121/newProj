package org.maven.M2O.Company_Owner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class AddInfoDao {

	public static void main(String[] args) {

		Location loc = new Location("Jaipur", "Rajasthan", "India", 302020);
		Location loc1 = new Location("Bangalore", "Karnataka", "India", 560006);
		Owner owner = new Owner();
		owner.setId(225);
		owner.setName("Ria Ramnani ");
		owner.setContact(97896869898l);
		owner.setTurnOver(66869d);
		

		Company company1 = new Company();
		company1.setRegNo(12522);
		company1.setcName("Astegic Infosoft Pvt Ltd");
		company1.setNo_Of_Emp(250);
		company1.setDepartment("Software");
		company1.setLocations(loc);
		company1.setOwner(owner);

		Company company2 = new Company();
		company2.setRegNo(198689);
		company2.setcName("Astegic Infosoft Pvt Ltd");
		company2.setNo_Of_Emp(450);
		company2.setDepartment("Software");
		company2.setLocations(loc1);
		company2.setOwner(owner);
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Company.class)
				.addAnnotatedClass(Owner.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		session.save(company1);
		session.save(company2);
		session.save(owner);
		txn.commit();
		session.close();

	}
}
