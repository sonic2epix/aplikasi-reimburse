/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.domain.master;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author fanani
 */

@Entity
@Table(name="reimburse_plafon")
public class MasterPlafon {
    @Id
    @GeneratedValue
    private Long id ;
    
    @Column(name="kode")
    private String Kode ;

    @Column(name="plafong")
    private Integer plafon ;

    @Column(name="tahun")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date tahun ;

    @ManyToOne
    @JoinColumn(name="pegawai" ,referencedColumnName="id", nullable=false)
    private MasterPegawai masterPegawai ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public MasterPegawai getMasterPegawai() {
        return masterPegawai;
    }

    public void setMasterPegawai(MasterPegawai masterPegawai) {
        this.masterPegawai = masterPegawai;
    }

    public Integer getPlafon() {
        return plafon;
    }

    public void setPlafon(Integer plafon) {
        this.plafon = plafon;
    }

    public Date getTahun() {
        return tahun;
    }

    public void setTahun(Date tahun) {
        this.tahun = tahun;
    }

    
}
