package com.niit.springmvcmaven;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public boolean isValidUser(String Username, String password) {
		// TODO Auto-generated method stub

		if( Username.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
