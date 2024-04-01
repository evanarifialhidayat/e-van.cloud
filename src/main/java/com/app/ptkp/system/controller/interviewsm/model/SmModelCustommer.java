package com.app.ptkp.system.controller.interviewsm.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.app.ptkp.system.controller.constanta.Param;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "scustommer" )
public class SmModelCustommer {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	@Column(name="scode")
	public String scode ;
	
	@Column(name="sname")
	public String sname;
	
	@Column(name="salamat")
	public String salamat;
    
    



	public Long getId_seq() {
		return id_seq;
	}





	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
	}





	public String getScode() {
		return scode;
	}





	public void setScode(String scode) {
		this.scode = scode;
	}





	public String getSname() {
		return sname;
	}





	public void setSname(String sname) {
		this.sname = sname;
	}





	public String getSalamat() {
		return salamat;
	}





	public void setSalamat(String salamat) {
		this.salamat = salamat;
	}





	@Override
	public String toString() {
		
				return "{\"recid\":"+                id_seq 
				+ ", \"sname\":\"" +             sname 
				+ "\", \"scode\":\"" +              scode 
				+ "\", \"salamat\":\"" +               salamat
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
