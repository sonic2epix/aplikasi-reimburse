/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.service;

import com.artivisi.reimburse.domain.master.MasterPegawai;
import java.util.List;

/**
 *
 * @author fanani
 */
public interface  MasterService {
    // service untuk master pegawai
    public void savePegawai(MasterPegawai masterPegawai);
    public void deletePegawai (MasterPegawai masterPegawai) ;
    public List<MasterPegawai> findAllPegawai();
    public MasterPegawai findPegawaiByName(String nama) ;
    public MasterPegawai findByKode (String kode) ;
}
