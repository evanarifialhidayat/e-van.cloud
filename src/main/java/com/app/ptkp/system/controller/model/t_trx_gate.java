package com.app.ptkp.system.controller.model;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.app.ptkp.system.controller.constanta.Param;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "t_trx_gate" )
public class t_trx_gate {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_trx_gate_id_seq_seq")
	    @SequenceGenerator(name = "t_trx_gate_id_seq_seq", sequenceName = "t_trx_gate_id_seq_seq")
	    @Column(name="id_seq")
	    public Long id_seq;
	    
	    @Column(name="shelter_code_gate_in_var",columnDefinition = "character varying(8)")
	    public String  shelter_code_gate_in_var ;
	    
	    @Column(name="terminal_code_gate_in_var",columnDefinition = "character varying(8)")
	    public String  terminal_code_gate_in_var ;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = Param.TIMEZONE)
	    @Column( name = "gate_in_on_dtm", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	    private LocalDateTime  gate_in_on_dtm;
	    
	    @Column(name="shelter_code_gate_out_var",columnDefinition = "character varying(8)")
	    public String  shelter_code_gate_out_var ;
	     
	    @Column(name="terminal_code_gate_out_var",columnDefinition = "character varying(8)")
	    public String  terminal_code_gate_out_var ;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = Param.TIMEZONE)
	    @Column(name = "gate_out_on_dtm", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	    private LocalDateTime gate_out_on_dtm;
	    
	    @Column(name="card_number_var",columnDefinition = "character varying(75)")
	    public String  card_number_var ;
	    
	    @Column(name="card_type_id_int")
	    private short card_type_id_int ;
	    
	    @Column(name="interop_id_int")
	    public Integer interop_id_int;
	    
	    @Column(name="minimum_balance_int")
	    public Integer minimum_balance_int ;
	    
	    @Column(name="balance_before_int")
	    public Integer balance_before_int ;
	    
	    @Column(name="normal_fare_int")
	    public Integer normal_fare_int ;
	    
	    @Column(name="fare_int")
	    public Integer fare_int ;
	    
	    @Column(name="balance_int")
	    public Integer balance_int ;
	    
	    @Column(name="m_id_var")
	    public String  m_id_var ;
	    
	    @Column(name="t_id_var")
	    public String  t_id_var ;
	    
	    @Column(name="transcode_txt",columnDefinition = "text")
	    public String  transcode_txt ;
	    
	    @Column(name="gate_in_boo")
	    public Boolean  gate_in_boo ;
	    
	    @Column(name="deduct_gate_in_boo")
	    public Boolean  deduct_gate_in_boo ;
	    
	    @JsonFormat(shape=JsonFormat.Shape.STRING)
	    @Column(name="p_latitude_flo")
	    private Double p_latitude_flo ;
	    
	    @JsonFormat(shape=JsonFormat.Shape.STRING)
	    @Column(name="p_longitude_flo")
	    private Double p_longitude_flo;
	    
	    @Column(name="transportation_type_id_int")
	    public Integer transportation_type_id_int ;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = Param.TIMEZONE)
	    @Column(name = "jaklingko_first_gate_in_on_dtm", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	    private LocalDateTime   jaklingko_first_gate_in_on_dtm;
	    
	    @Column(name="jaklingko_subsidy_accumulation_int")
	    public Integer jaklingko_subsidy_accumulation_int ;
	    
	    @Column(name="journey_counter_int")
	    public Integer  journey_counter_int;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = Param.TIMEZONE)
	    @Column(name = "expiration_on_dtm", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	    private LocalDateTime expiration_on_dtm ;
	    
	    @Column(name="status_var",columnDefinition = "character varying(1)")
	    public String  status_var ;
	    
	    @Column(name="desc_var",columnDefinition = "character varying(2)")
	    public String  desc_var ;
	    
	    @JsonFormat(shape=JsonFormat.Shape.STRING)
	    @Column(name="promo_id_int")
	    private Long   promo_id_int ;
	    
	    //smallint
	    @JsonFormat(shape=JsonFormat.Shape.STRING)
	    @Column(name="settlement_sync_status_int")
	    private Short settlement_sync_status_int ;
	    
	    @Column(name="shelter_code_gate_in_before_var")
	    public String  shelter_code_gate_in_before_var ;
	    
	    @Column(name="terminal_code_gate_in_before_var")
	    public String  terminal_code_gate_in_before_var ;
	    
	    @Column(name="gate_in_before_on_dtm")
	    public String  gate_in_before_on_dtm  ;
	    
	    @Column(name="shelter_code_gate_out_before_var")
	    public String  shelter_code_gate_out_before_var ;
	    
	    @Column(name="terminal_code_gate_out_before_var")
	    public String  terminal_code_gate_out_before_var ;
	    
	    @Column(name="gate_out_before_on_dtm")
	    public String  gate_out_before_on_dtm ;
	    
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = Param.TIMEZONE)
	    @Column(name = "sync_on_dtm", columnDefinition = "TIMESTAMP WITH TIME ZONE")
	    private LocalDateTime  sync_on_dtm;
	    
	    @Column(name="free_service_boo")
	    public Boolean free_service_boo ;
	    
	    @Column(name="deduct_boo")
	    public Boolean deduct_boo ;
	    
	    @Column(name="reset_first_gate_in_boo")
	    public Boolean reset_first_gate_in_boo ;
	    
	    @Column(name="processing_time_int")
	    public Integer   processing_time_int;
}
