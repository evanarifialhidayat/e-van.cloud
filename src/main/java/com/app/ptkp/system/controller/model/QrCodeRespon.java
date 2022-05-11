package com.app.ptkp.system.controller.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class QrCodeRespon {
    private Integer recid;
    private String snama;
    private String  snomor;
    private String sjudul;
    private String slembaga;
    private Date stanggal;
    private String ssertifikat;
    public QrCodeRespon(Integer recid, String snama, String snomor, String sjudul, String slembaga, Date stanggal,
            String ssertifikat) {
        this.recid = recid;
        this.snama = snama;
        this.snomor = snomor;
        this.sjudul = sjudul;
        this.slembaga = slembaga;
        this.stanggal = stanggal;
        this.ssertifikat = ssertifikat;
    }
    @Override
    public String toString() {
        return "{\"recid\"=\""+ recid + "\", \"sjudul\"=\"" + sjudul + "\", \"slembaga\"=\"" + slembaga + "\", \"snama\"=\"" + snama
                + "\", \"snomor\"=\"" + snomor + "\", \"ssertifikat\"=\"" + ssertifikat + "\", \"stanggal\"=\"" + stanggal + "\"}";
    }


}
