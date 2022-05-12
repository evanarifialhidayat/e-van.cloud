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
@Table(name = "Sertifikat" )
public class Sertifikat {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	@Column(name="snama")
	public String snama ;
	
	@Column(name="snomor")
	public String snomor;
	
	@Column(name="sjudul")
	public String sjudul;
	
	@Column(name="slembaga")
	public String slembaga;

    @Column(name = "stanggal")
	public String stanggal;

    @Column(name="ssertifikat" ,columnDefinition = "text")
	public String ssertifikat;

	public Long getId_seq() {
		return id_seq;
	}

	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
	}

	public String getSnama() {
		return snama;
	}

	public void setSnama(String snama) {
		this.snama = snama;
	}

	public String getSnomor() {
		return snomor;
	}

	public void setSnomor(String snomor) {
		this.snomor = snomor;
	}

	public String getSjudul() {
		return sjudul;
	}

	public void setSjudul(String sjudul) {
		this.sjudul = sjudul;
	}

	public String getSlembaga() {
		return slembaga;
	}

	public void setSlembaga(String slembaga) {
		this.slembaga = slembaga;
	}

	public String getStanggal() {
		return stanggal;
	}

	public void setStanggal(String stanggal) {
		this.stanggal = stanggal;
	}

	public String getSsertifikat() {
		return ssertifikat;
	}

	public void setSsertifikat(String ssertifikat) {
		this.ssertifikat = ssertifikat;
	}

	
	

    
}
