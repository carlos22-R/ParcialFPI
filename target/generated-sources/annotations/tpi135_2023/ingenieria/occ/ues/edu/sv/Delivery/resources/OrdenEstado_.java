package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Orden;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(OrdenEstado.class)
public class OrdenEstado_ { 

    public static volatile SingularAttribute<OrdenEstado, String> estado;
    public static volatile SingularAttribute<OrdenEstado, Long> idOrdenEstado;
    public static volatile SingularAttribute<OrdenEstado, Date> fechaCreacion;
    public static volatile SingularAttribute<OrdenEstado, String> comentarios;
    public static volatile SingularAttribute<OrdenEstado, Orden> idOrden;

}