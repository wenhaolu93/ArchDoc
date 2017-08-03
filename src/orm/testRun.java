import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class testRun{
	/*
	public static void main(String[] args){
    	Dimentions di = new Dimentions();
    	di.setDimenID(0);
    	di.setDomainID(10);
    	di.setName("new");
    	
    	Session session = HibernateUtil.getSession();
    	Transaction ts = session.beginTransaction();
    	try {  
            session.save(di);  
            ts.commit();  
        } finally {  
            if(session != null)  
                session.close();  
        }  
    }*/
	public static void main(String[] args) throws Exception {  
        // A SessionFactory is set up once for an application!  
         StandardServiceRegistry registry = new StandardServiceRegistryBuilder()  
                .configure() // configures settings from hibernate.cfg.xml  
                .build();  
        try {  
            SessionFactory sf = new MetadataSources( registry ).buildMetadata().buildSessionFactory();  
            Session session = sf.openSession();  
            Transaction transaction = session.beginTransaction();
            Domains dom = new Domains();
            dom.setId(10);
            dom.setName("newdomain");
            Dimentions di = new Dimentions();
            di.setDimenID(0);
            di.setDomainID(10);
            di.setName("new"); 
            //session.save(dom);
            session.save(di);
            transaction.commit();  
            session.close();  
            sf.close();  
              
        }  
        catch (Exception e) {  
            StandardServiceRegistryBuilder.destroy( registry );  
            e.printStackTrace();  
        }  
    }  
}
