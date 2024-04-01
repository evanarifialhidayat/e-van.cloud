package com.app.ptkp.system.controller.interviewsm.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.app.ptkp.system.controller.constanta.Param;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "spodetail" )
public class SmModelPoDetail {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    

    @Column(name="sqty")
	public Integer sqty ;
    

	  @ManyToOne(fetch = FetchType.EAGER, optional = false)
	  @JoinColumn(name = "item_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  private SmModelItem smmodelitem;
	 
	  
	  @ManyToOne
	  @JoinColumn(name="spoid_id", nullable=false)
	  private SmModelPo spoid;
	  
	  

	public Integer getSqty() {
		return sqty;
	}





	public void setSqty(Integer sqty) {
		this.sqty = sqty;
	}





	public SmModelPo getSpoid() {
		return spoid;
	}





	public void setSpoid(SmModelPo spoid) {
		this.spoid = spoid;
	}





	public SmModelItem getSmmodelitem() {
		return smmodelitem;
	}





	public void setSmmodelitem(SmModelItem smmodelitem) {
		this.smmodelitem = smmodelitem;
	}





	public Long getId_seq() {
		return id_seq;
	}





	public void setId_seq(Long id_seq) {
		this.id_seq = id_seq;
	}





	@Override
	public String toString() {
		
				return "{\"recid\":"+                id_seq 
				+ ", \"smmodelitem\":\"" +             smmodelitem 
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
