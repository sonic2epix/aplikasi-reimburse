/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.domain.master;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author fanani
 */
@Entity
@Table(name="reimburse_jenis")
public class MasterJenisReimburse implements Serializable {

    @Id
    @GeneratedValue
    private Long id ;

    @Column(name="kode_reimburse")
    private String kode ;

    @Column(name="nama_reimburse")
    private String nama ;

    @Column(name="keterangan")
    private String keterangan ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    

}
