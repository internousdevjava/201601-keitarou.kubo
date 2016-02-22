package com.internousdevjava.kubo.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevjava.kubo.dao.Logintestdao;
import com.internousdevjava.kubo.dto.Logintestdto;
import com.opensymphony.xwork2.ActionSupport;

public class LogintestAction extends ActionSupport implements SessionAware {
	public String id;
	public String password;
	private Map<String, Object> session;

	public String execute() {

		Logintestdao dao = new Logintestdao();

		boolean rel = dao.select(id, password);

		if (!rel) {
			return ERROR;
		}

		Logintestdto dto = new Logintestdto(id, password);

		session.put("id", dto.getId());

		return SUCCESS;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return password;
	}

	public void setPass(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
