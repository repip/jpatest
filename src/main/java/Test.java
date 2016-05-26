
import com.mycompany.jpatest.entity.Yycsc99f;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ale
 */
public class Test {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        /*
        Customer cust = new Customer(null, "mario", "rossi", "12121213", "mario@mario.it", "ivrea", "it", new Date());
        em.getTransaction().begin();
        em.persist(cust);
        em.getTransaction().commit();
         */
        List<Yycsc99f> resultlist = em.createQuery("select e from Yycsc99f e ORDER BY e.nrsey9 ", Yycsc99f.class).getResultList();

        for (Yycsc99f y : resultlist) {
            System.out.println(y.getCdary9() + " " + y.getDsary9());
        }
        em.close();

    }

}
