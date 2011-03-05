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
@Table(name="reimburse_pegawai")
public class MasterPegawai implements Serializable {
    @Id
    @GeneratedValue
    private Long id ;

    @Column(name="kode_pegawai")
    private String kode ;

    @Column(name="nama_pegawai")
    private String nama ;

    @Column(name="jabatan")
    private String jabatan ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String Kode) {
        this.kode = Kode;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


}
