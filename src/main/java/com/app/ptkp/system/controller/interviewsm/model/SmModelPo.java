package com.app.ptkp.system.controller.interviewsm.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

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
@Table(name = "spo" )
public class SmModelPo {

    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id_seq")
    public Long id_seq;
    
	
//	  @ManyToOne(fetch = FetchType.EAGER, optional = false)
//	  @JoinColumn(name = "item_id", nullable = false)
//	  @OnDelete(action = OnDeleteAction.CASCADE)
//	  private SmModelItem smModelItem;
    
    @Column(name="spo")
	public String spo ;
	  
	 

	  @ManyToOne(fetch = FetchType.EAGER, optional = false)
	  @JoinColumn(name = "supplier_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  private SmModelSupplier smmodelsupplier;
	 
	 
	 
	 
	 @OneToMany(mappedBy="spoid")
	 private List<SmModelPoDetail> spoid;
	 
	 




	public String getSpo() {
		return spo;
	}





	public void setSpo(String spo) {
		this.spo = spo;
	}





	public List<SmModelPoDetail> getSpoid() {
		return spoid;
	}





	public void setSpoid(List<SmModelPoDetail> spoid) {
		this.spoid = spoid;
	}





	public SmModelSupplier getSmmodelsupplier() {
		return smmodelsupplier;
	}





	public void setSmmodelsupplier(SmModelSupplier smmodelsupplier) {
		this.smmodelsupplier = smmodelsupplier;
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
				+ ", \"smmodelsupplier\":\"" +             smmodelsupplier 
				+ "\", \"id_seq\":\""+               id_seq 
				+"\"}";
	}

	

    
}
