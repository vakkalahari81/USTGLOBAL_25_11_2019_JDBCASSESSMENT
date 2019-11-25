package com.ustglobal.jdbcassesment.contactmanager;

import com.ustglobal.jdbcassessment.dao.ContactDAO;
import com.ustglobal.jdbcassessment.dao.ContactDAOImpl;

public class ContactManager {
	
	private ContactManager() {
		
	}
public static ContactDAO getContactDAO() {
		
		return new ContactDAOImpl();
	}

}
