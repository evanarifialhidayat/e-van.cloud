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
@Table(name = "smuser" )
public class SmModelUser {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	@Column(name="sfullname")
	public String sfullname ;
	
	@Column(name="semail")
	public String semail;
	
	@Column(name="sname")
	public String sname;
    
	@Column(name="spass")
	public String spass;
    
    

	public String getSname() {
		return sname;
	}





	public void setSname(String sname) {
		this.sname = sname;
	}




	public Long getId_seq() {
		return id_seq;
	}





	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
	}





	public String getSfullname() {
		return sfullname;
	}





	public void setSfullname(String sfullname) {
		this.sfullname = sfullname;
	}





	public String getSemail() {
		return semail;
	}





	public void setSemail(String semail) {
		this.semail = semail;
	}






	@Override
	public String toString() {
		
				return "{\"recid\":"+                id_seq 
				+ ", \"sfullname\":\"" +             sfullname 
				+ "\", \"semail\":\"" +              semail 
				+ "\", \"spass\":\"" +               spass
				+ "\", \"sname\":\"" +               sname 
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
