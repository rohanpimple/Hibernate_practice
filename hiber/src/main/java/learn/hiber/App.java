package learn.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
    	
    	Configuration con= new Configuration();
    	con.configure();
    	SessionFactory fact = con.buildSessionFactory();
    	Session sess = fact.openSession();
    	data dt = sess.get(data.class, 3);
    	Transaction tx = sess.beginTransaction();
//    	sess.save(dt);
    	
    	
//    	System.out.println(dt);
    	
//    	dt.setAddress("pune");
//    	sess.merge(dt);
    	
    	sess.remove(dt);
    	tx.commit();
    }

}
