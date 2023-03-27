package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.MenuComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenDetallePK;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(OrdenDetalle.class)
public class OrdenDetalle_ { 

    public static volatile SingularAttribute<OrdenDetalle, MenuComercio> menuComercio;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> precio;
    public static volatile SingularAttribute<OrdenDetalle, String> observaciones;
    public static volatile SingularAttribute<OrdenDetalle, OrdenDetallePK> ordenDetallePK;
    public static volatile SingularAttribute<OrdenDetalle, BigDecimal> cantidad;
    public static volatile SingularAttribute<OrdenDetalle, Orden> orden;

}