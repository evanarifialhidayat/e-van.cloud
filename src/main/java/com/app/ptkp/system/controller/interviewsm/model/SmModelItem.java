package com.app.ptkp.system.controller.interviewsm.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.app.ptkp.system.controller.constanta.Param;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "smitem" )
public class SmModelItem {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	@Column(name="sname")
	public String sname ;
	
	@Column(name="scode")
	public String scode;
	
	@Column(name="suom")
	public String suom;
	
	@Column(name="sharga")
	public String sharga;
	
	




	public String getSharga() {
		return sharga;
	}






	public void setSharga(String sharga) {
		this.sharga = sharga;
	}






	public Long getId_seq() {
		return id_seq;
	}






	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
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






	@Override
	public String toString() {
		
				return "{\"recid\":"+                id_seq 
				+ ", \"sname\":\"" +                 sname 
				+ "\", \"scode\":\"" +               scode 
				+ "\", \"sharga\":\"" +               sharga 
				+ "\", \"suom\":\"" +                suom 
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
