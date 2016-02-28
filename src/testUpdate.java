import org.hibernate.*;
import com.tutorialDB.Dept;
import com.util.HibernateUtil;

public class testUpdate {

	 public static void main(String[] args)
		throws HibernateException {
		 
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 
		 Dept d1 = (Dept) session.load(Dept.class, 1);
		 
		 d1.setNomDept("finance");
		 session.save(d1);
		 
		 session.getTransaction().commit();
		 HibernateUtil.getSessionFactory().close();		 
	 }
}