package com.struts.controleur;

import org.hibernate.*;
import com.tutorialDB.Personnel;
import com.util.HibernateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping; 
import com.struts.data.PersonnelForm;

public final class AjoutPersAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, 
                               HttpServletRequest req, 
                               HttpServletResponse res) throws Exception {
		
		String resultat = null;
		int idDept = ((PersonnelForm) form).getIdDept();
		String nomPersonnel = ((PersonnelForm) form).getNomPersonnel();
		String prenomPersonnel = ((PersonnelForm) form).getPrenomPersonnel();
		Date dateNaissance;
		String dateValue = ((PersonnelForm) form).getDateNaissance();

		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();			 
			session.beginTransaction();

			Personnel p1 = new Personnel();
			p1.setIdDept(idDept);
			p1.setNomPersonnel(nomPersonnel);
			p1.setPrenomPersonnel(prenomPersonnel);

        	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        	dateNaissance = sdf.parse(dateValue);

			p1.setDateNaissance(dateNaissance);
			session.save(p1);

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