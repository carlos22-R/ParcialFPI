package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Pago;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Factura.class)
public class Factura_ { 

    public static volatile SingularAttribute<Factura, String> observaciones;
    public static volatile SingularAttribute<Factura, String> numeroFactura;
    public static volatile SingularAttribute<Factura, Date> fechaEmision;
    public static volatile SingularAttribute<Factura, Boolean> anulada;
    public static volatile SingularAttribute<Factura, Orden> idOrden;
    public static volatile CollectionAttribute<Factura, Pago> pagoCollection;

}