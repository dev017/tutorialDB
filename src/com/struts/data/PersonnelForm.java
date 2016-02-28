package com.struts.data;

import java.util.Date;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;

public class PersonnelForm extends ActionForm {
	private int idPersonnel;
	private int idDept;
	private String nomPersonnel;
	private String prenomPersonnel;
	private String dateNaissance;
	
	public int getIdPersonnel() {
		return idPersonnel;
	}
	
	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}
	
	public int getIdDept() {
		return idDept;
	}
	
	public void setIdDept(int idDept) {
		this.idDept = idDept;
	}

	public String getNomPersonnel() {
		return nomPersonnel;
	}
	
	public void setNomPersonnel(String nomPersonnel) {
		this.nomPersonnel = nomPersonnel;
	}
	
	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}
	
	public void setPrenomPersonnel(String prenomPersonnel) {
		this.prenomPersonnel = prenomPersonnel;
	}
	
	public String getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}	

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		return errors;
	}
		
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		this.idPersonnel = 0;
		this.idDept = 0;
		this.nomPersonnel = null;
		this.prenomPersonnel = null;
		this.dateNaissance = null;
	}
}