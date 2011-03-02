/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.artivisi.reimburse.tes;


import com.artivisi.reimburse.service.MasterService;
import com.artivisi.reimburse.service.impl.MasterServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author fanani
 */
public class Main {
    MasterService masterService = new MasterServiceImpl() ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");

// cara lama dengan cara menginisialisasi open session sendiri


//        SessionFactory sessionFactory = new AnnotationConfiguration()
//                .configure()
//                .buildSessionFactory() ;


//        Category category = new Category() ;
//        category.setName("Berita");
//        category.setDescription("Berita Terbaru");
//
//        Session session = sessionFactory.openSession();
//        Transaction tx = session.beginTransaction() ;
//
//        session.save(category) ;
//        tx.commit();
//        session.close() ;

    }

}
