package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control.RestResourcePattern;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Direccion;

/**
 *
 * @author eduaf
 */
@Path("direccion")
@RequestScoped
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class DireccionRest {

    @Inject
    DireccionBean direccionbean;

    @GET
    public List<Direccion> listAll() {
        return direccionbean.ListAll();
    }

    @POST
    public Response crearDireccion(Direccion direccion, @Context UriInfo info) {
    if(direccion != null){
            try {
                direccionbean.CrearDireccion(direccion);
                if(direccion.getIdTerritorio()!=null){
                    UriBuilder uriBuilder=info.getAbsolutePathBuilder();
                    uriBuilder.path(direccion.getIdDireccion().toString());
                    return Response.created(uriBuilder.build()).build();
                }
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(),ex);
            }
  
        }
        return Response.status(Response.Status.BAD_REQUEST).header(RestResourcePattern.NULL_PARAMETER, null).build();
    }
        

    }
