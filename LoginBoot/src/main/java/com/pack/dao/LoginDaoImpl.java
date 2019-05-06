package com.pack.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Autowired
	private  JdbcTemplate  jtemplate;

	public boolean checkDetails(String username, String password) {
		int i = jtemplate.queryForObject("select  count(*) from  Login_Tab  where  username=? and password=?",Integer.class,username,password);
		if(i==1) {
			return true;
		}
		return false;
	}

}
