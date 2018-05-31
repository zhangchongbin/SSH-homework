package com.zhbit.bbs.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	
	private String username;
	private String pwd;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String execute() throws Exception {
		if (this.username.equals("admin") && this.pwd.equals("123")) {
			Map session = ActionContext.getContext().getSession();
			session.put("login", username);
			return SUCCESS; // µÇÂ¼³É¹¦·µ»ØSUCCESS
		} else {
			return LOGIN; // µÇÂ¼Ê§°Ü·µ»ØLOGIN
		}
	}
	
}
