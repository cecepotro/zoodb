/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.zoo.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import mx.itson.zoo.entidades.Animal;
import mx.itson.zoo.utils.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author janto
 */
public class AnimalDAO {
    
    public static List<Animal> obtenerTodos() {
        List<Animal> animales = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            CriteriaQuery<Animal> criteriaQuery =
                    session.getCriteriaBuilder().createQuery(Animal.class);
            criteriaQuery.from(Animal.class);
            
            animales = session.createQuery(criteriaQuery).getResultList();
        } catch(Exception ex){
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return animales;
    }
    
    public static boolean guardar(Animal a){
        boolean resultado = false;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction(); 
            
            session.save(a);
            session.getTransaction().commit();
            
            resultado = a.getId() != 0;
        } catch(Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return resultado;
    }
}
