/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Territorio;

/**
 *
 * @author CENTRA
 */
@Stateless
public class TerritorioBean {
    @PersistenceContext
    EntityManager em;
    
    public List<Territorio> ListTerritorio(){
        return em.createNamedQuery("Territorio.findAll").getResultList();
    }
    public void CrearTerritorio(Territorio territorio){
        em.persist(territorio); 
    }
}
