/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.service.impl;

import com.artivisi.reimburse.domain.master.MasterPegawai;
import com.artivisi.reimburse.service.MasterService;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fanani
 */

@Service("MasterService")
@Transactional(readOnly=true)
public class MasterServiceImpl implements MasterService{
    @Autowired
    private SessionFactory sessionFactory ;
    private Object masterPegawai ;

    @Transactional(readOnly=false)
    public void savePegawai(MasterPegawai masterPegawai) {
        sessionFactory.getCurrentSession().save(masterPegawai) ;
    }

    @Transactional(readOnly=false)
    public void deletePegawai(MasterPegawai masterPegawai) {
        sessionFactory.getCurrentSession().delete(masterPegawai);
    }

    public List<MasterPegawai> findAllPegawai() {
        return sessionFactory.getCurrentSession()
                .createQuery("from MasterPegawai masterPegawai")
                .list();
    }

    public MasterPegawai findPegawaiByName(String nama) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public MasterPegawai findByKode(String kode) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
