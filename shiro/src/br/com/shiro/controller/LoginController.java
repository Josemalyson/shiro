package br.com.shiro.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;

@ManagedBean
public class LoginController {

	private String username;
	private String password;

	@PostConstruct
	public void init() {
		username = new String();
		password = new String();
	}

	public void login() {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		token.setRememberMe(true);
		SecurityUtils.getSubject().login(token);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
