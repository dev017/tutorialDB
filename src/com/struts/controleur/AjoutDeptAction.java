package com.struts.controleur;

import org.hibernate.*;
import com.tutorialDB.Dept;
import com.util.HibernateUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 
import com.struts.data.DeptForm;

public final class AjoutDeptAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, 
                               HttpServletRequest req, 
                               HttpServletResponse res) throws Exception {
		
		String resultat = null;
		String nomDept = ((DeptForm) form).getNomDept();

		
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();			 
			session.beginTransaction();
			
			Dept d1 = new Dept();
			d1.setNomDept(nomDept);
			session.save(d1);
			 
			session.getTransaction().commit();
			HibernateUtil.getSessionFactory().close();	
			resultat = "succes";
			
		}catch(Exception ex){
			HibernateUtil.getSessionFactory().close();
			resultat = "echec";
		}
		return mapping.findForward(resultat);
	}
}