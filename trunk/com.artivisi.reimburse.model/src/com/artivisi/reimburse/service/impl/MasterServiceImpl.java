/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.service.impl;

import com.artivisi.reimburse.master.Pegawai;
import com.artivisi.reimburse.service.MasterService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author fanani
 */

@Repository @Transactional
public class MasterServiceImpl implements MasterService {
    private SessionFactory sessionFactory ;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void savePegawai(Pegawai pegawai) {
        sessionFactory.getCurrentSession().save(pegawai) ;
    }

    public Pegawai findPegawaiByKode(String kode) {
        return (Pegawai) sessionFactory.getCurrentSession()
                .get(Pegawai.class, kode) ;
    }

}
