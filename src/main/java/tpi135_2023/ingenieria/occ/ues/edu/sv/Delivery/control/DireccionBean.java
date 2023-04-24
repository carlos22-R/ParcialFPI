package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Direccion;

/**
 *
 * @author eduaf
 */
@Stateless
public class DireccionBean {
    
    @PersistenceContext
    EntityManager em;
    public List<Direccion> ListAll(){
        return em.createNamedQuery("Direccion.findAll").getResultList();
    }
    
    public void CrearDireccion(Direccion direccion){
        em.persist(direccion );
    }
    
}
