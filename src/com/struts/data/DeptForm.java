package com.struts.data;

import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;

public class DeptForm extends ActionForm {
	int idDept;
	String nomDept;

	public int getIdDept() {
		return idDept;
	}
	
	  public void setIdDept(int idDept) {
	    this.idDept = idDept;
	  }
	
	  public String getNomDept() {
	    return nomDept;
	  }
	
	  public void setNomDept(String nomDept) {
	    this.nomDept = nomDept;
	  }
	
	  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    return errors;
	  }
	
	  public void reset(ActionMapping mapping, HttpServletRequest request) {
	    this.idDept = 0;
	    this.nomDept = null;
	  }

}