package com.app.ptkp.system.controller.interviewsm.model.json;

import java.io.Serializable;

public class BodyJson implements Serializable{
	
	public String sname;
	public String scode;
	public String suom;
	public String sharga;
	public String salamat;
	
	
	public String getSalamat() {
		return salamat;
	}
	public void setSalamat(String salamat) {
		this.salamat = salamat;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
	public String getSuom() {
		return suom;
	}
	public void setSuom(String suom) {
		this.suom = suom;
	}
	public String getSharga() {
		return sharga;
	}
	public void setSharga(String sharga) {
		this.sharga = sharga;
	}
	
	
	
	

}
