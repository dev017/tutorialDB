import java.util.Iterator;
import org.hibernate.*;
import com.util.HibernateUtil;

public class testSelect {

	 public static void main(String[] args)
		throws HibernateException {
		 
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 
		 String query = "select d.id_dept, d.nom_dept from dept d where d.id_dept = 1";
		 
		 Iterator results = session.createSQLQuery(query).list().iterator();
		 
		 while(results.hasNext())
		 {
			 Object[] row = (Object[]) results.next();
			 Integer id = (Integer) row[0];
			 String nom = (String) row[1];
			 System.out.println("id_dept = "+id+"| nom_dept = "+nom);
		 }
		 
		 session.getTransaction().commit();
		 HibernateUtil.getSessionFactory().close();			 
	 }
}