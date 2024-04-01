package com.app.ptkp.system.controller.interview.model;

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
@Table(name = "modelforminput" )
public class ModelFormInput {

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

    @Column(name = "scontactnumber")
	public String scontactnumber;
    
    @Column(name = "saddress")
    public String saddress;
    
    @Column(name = "spostcode")
    public String spostcode;
    
    @Column(name = "sradio")
    public String sradio;
    
    
    
    

	public String getSname() {
		return sname;
	}





	public void setSname(String sname) {
		this.sname = sname;
	}





	public String getSaddress() {
		return saddress;
	}





	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}





	public String getSpostcode() {
		return spostcode;
	}





	public void setSpostcode(String spostcode) {
		this.spostcode = spostcode;
	}





	public String getSradio() {
		return sradio;
	}





	public void setSradio(String sradio) {
		this.sradio = sradio;
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





	public String getScontactnumber() {
		return scontactnumber;
	}





	public void setScontactnumber(String scontactnumber) {
		this.scontactnumber = scontactnumber;
	}





	@Override
	public String toString() {
		
				return "{\"recid\":"+                id_seq 
				+ ", \"sfullname\":\"" +             sfullname 
				+ "\", \"semail\":\"" +              semail 
				+ "\", \"scontactnumber\":\"" +      scontactnumber
				+ "\", \"sname\":\"" +               sname 
				+ "\", \"saddress\":\"" +            saddress
				+ "\", \"spostcode\":\"" +           spostcode 
				+ "\", \"sradio\":\"" +              sradio 
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
