import org.hibernate.*;
import com.tutorialDB.Dept;
import com.util.HibernateUtil;

public class testInsert {

	 public static void main(String[] args)
		throws HibernateException {
		 
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 
		 Dept d1 = new Dept();
		 d1.setNomDept("informatique");
		 session.save(d1);
		 
		 session.getTransaction().commit();
		 HibernateUtil.getSessionFactory().close();
	 }
}