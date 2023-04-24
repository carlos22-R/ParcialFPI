/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;

/**
 *
 * @author CENTRA
 */
@Stateless
public class TipoComercioBean {

 @PersistenceContext
 EntityManager em;
 public List<TipoComercio> ListAllTP(){
     return em.createNamedQuery("TipoComercio.findAll").getResultList();
 }
 public void InsertarTipoComercio(TipoComercio tipoComercio){
     em.persist(tipoComercio);
 }
 public TipoComercio findTipoComercioById(TipoComercio tipoComercio){
     return em.find(TipoComercio.class ,tipoComercio.getIdTipoComercio());
 }
 
}
