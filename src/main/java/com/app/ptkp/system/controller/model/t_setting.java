package com.app.ptkp.system.controller.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "t_setting")
public class t_setting {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	@Column(name="nama_function")
	public String nama_function ;
	
	@Column(name="datas",columnDefinition = "text")
	public String datas;
	
	@Column(name="url_api")
	public String url_api;
	
	@Column(name="status",columnDefinition = "bigint default 0")
	public Long status;

}
