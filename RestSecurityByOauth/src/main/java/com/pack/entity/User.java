package com.pack.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_demo")
public class User {
@Id
@Column(name="id")
private int userId;

@Column(name="name",length=20)
private String userName;

@Column(name="email",length=40)
private String email;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + "]";
}



}
