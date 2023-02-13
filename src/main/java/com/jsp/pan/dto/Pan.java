package com.jsp.pan.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int panid;
	private String panno;

	public int getPanid() {
		return panid;
	}

	public void setPanid(int panid) {
		this.panid = panid;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}


}
