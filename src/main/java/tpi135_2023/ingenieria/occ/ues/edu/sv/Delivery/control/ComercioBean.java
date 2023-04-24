package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;

import java.util.List;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ComercioTipoComercioPK;

@Stateless
public class ComercioBean {

    @PersistenceContext
    EntityManager em;
    public List<Comercio> ListAll(){
        return em.createNamedQuery("Comercio.findAll").getResultList();
    }

    public void InsertarComercio(Comercio comercio){
        em.persist(comercio );
    }
    public Comercio findcomercioById(Comercio comercio){
        return em.find(Comercio.class, comercio.getIdComercio());
    }

      public int ListAlltp(Long idComercio){
        if (idComercio != null && em != null) {
            Query q = em.createNamedQuery("ComercioTipoComercio.countByIdPersona");
            q.setParameter("idComercio", idComercio);
            return ((Long) q.getSingleResult()).intValue(); 
        }
        return 0; 
    }

        public void InsertarTPC(int idComercio , int idTipocomercio){
               ComercioTipoComercioPK newpk= new ComercioTipoComercioPK(idComercio, idTipocomercio);
               ComercioTipoComercio newT=  new ComercioTipoComercio(newpk);
               em.persist(newT);
        }

}
