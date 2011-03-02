/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.service;

import com.artivisi.reimburse.master.Pegawai;

/**
 *
 * @author fanani
 */
public interface MasterService {
    public void savePegawai (Pegawai pegawai) ;
    public Pegawai findPegawaiByKode (String kode) ;
}
