package com.app.ptkp.system.controller.model;

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
@Table(name = "userlogin" )
public class UserLogin {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
    @Column(name="username")
	public String username ;
	
	@Column(name="password")
	public String password;	
    
	public Long getId_seq() {
		return id_seq;
	}

	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
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

	@Override
	public String toString() {
		
				return "{recid:"+        id_seq 
						+ ",username:" +         username 
						+ ",password:" +      password 				
				+"}";
	}
	
	
	


	

    
}

