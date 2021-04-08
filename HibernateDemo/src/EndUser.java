import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EndUser {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		//insert operation
		/*Employee emp = new Employee();
		emp.setId(103);
		emp.setName("Teja");
		emp.setGender("Female");
		emp.setSalary(34261.14);
		Transaction txt = s.beginTransaction();
		s.save(emp);
		txt.commit();*/
		
		//Update operation 1st way
		/*Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Shanmukh");
		emp.setGender("Male");
		emp.setSalary(75234.24);
		Transaction txt = s.beginTransaction();
		s.update(emp);
		txt.commit();*/
		
		//update operation 2nd way
		/*Object obj = s.load(Employee.class, new Integer(101));
		Employee emp = (Employee)obj;
		emp.setName("Shannu");
		Transaction txt = s.beginTransaction();
		s.update(emp);
		txt.commit();*/
		
		//delete operation
		/*Object obj = s.load(Employee.class, new Integer(103));
		Employee emp = (Employee)obj;
		s.delete(emp);
		Transaction txt = s.beginTransaction();
		txt.commit();*/
		
		//select operation
		/*Object obj = s.load(Employee.class, new Integer(103));
		Employee emp = (Employee)obj;
		System.out.println(emp.getId()+","+emp.getName()+","+emp.getGender()+","+emp.getSalary());
		Transaction txt = s.beginTransaction();
		txt.commit();*/
				
		s.close();
		sf.close();
	}

}
