/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.control;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.json.bind.JsonbBuilder;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.TipoComercio;

/**
 *
 * @author CENTRA
 */
@Path("tipocomercio")
@RequestScoped
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class TipoComercioRest {
  @Inject
   TipoComercioBean tipoComercioBean;
  @GET
  public List<TipoComercio> ListAll(){
      return tipoComercioBean.ListAllTP();
  }
  @POST
  public Response InsertarTC(TipoComercio tipoComercio,@Context UriInfo info){
      if (tipoComercio != null) {
            try {
                tipoComercioBean.InsertarTipoComercio(tipoComercio);
                if(tipoComercio.getIdTipoComercio()!=null){
                    UriBuilder uriBuilder=info.getAbsolutePathBuilder();
                    uriBuilder.path(tipoComercio.getIdTipoComercio().toString());
                    return Response.created(uriBuilder.build()).build();
                }
     
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE,ex.getMessage(),ex);
            }
            return Response.status(Response.Status.BAD_REQUEST).header(RestResourcePattern.WRONG_PARAMETER,JsonbBuilder.create().toJson(tipoComercio)).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).header(RestResourcePattern.NULL_PARAMETER, null).build();
  }
  @GET
    @Path("/{id}")
    public Response FindIdTP(@PathParam("id") int id) {
        try {
            TipoComercio nuevo = new TipoComercio(id);
            TipoComercio encontrado = tipoComercioBean.findTipoComercioById(nuevo);
            if (encontrado == null) {
                return Response.status(Response.Status.NOT_FOUND).header(RestResourcePattern.ID_NOT_FOUND, Collections.EMPTY_LIST).build();
            }
            return Response.ok().entity(encontrado).build();
        } catch (Exception e) {
            return Response.status(Response.Status.NOT_FOUND).header(RestResourcePattern.WRONG_PARAMETER, Collections.EMPTY_LIST).build();
        }

    }
}
