package com.ustglobal.jdbcassessment.dao;

import java.util.ArrayList;

import com.ustglobal.jdbcassessment.dto.ContactBean;

public interface ContactDAO {


	public ArrayList<ContactBean>showAllCOntacts();
	public ContactBean searchContact(String name);
	public void addContact();
	public void deleteContact();
	public void editContact();

}
