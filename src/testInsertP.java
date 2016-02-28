import java.text.SimpleDateFormat;

import org.hibernate.*;

import com.tutorialDB.Dept;
import com.tutorialDB.Personnel;
import com.util.HibernateUtil;
import java.util.Date;

public class testInsertP {

	 public static void main(String[] args)
		throws HibernateException {
		 Date dateNaissance;
		 Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		 session.beginTransaction();
		 	
		 Personnel p1 = new Personnel();
		 p1.setIdDept(1);
		 p1.setNomPersonnel("aaa");
		 p1.setPrenomPersonnel("bbb");
			
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 //dateNaissance = sdf.parse(value.toString());
			
		 //p1.setDateNaissance(dateNaissance);	
		 session.save(p1);
			 
		 session.getTransaction().commit();
		 HibernateUtil.getSessionFactory().close();	
		 
	 }
}