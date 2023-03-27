package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Cliente;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Entrega;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Factura;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.OrdenDetalle;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.OrdenEstado;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Sucursal;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Sucursal> idSucursal;
    public static volatile SingularAttribute<Orden, BigInteger> idDireccion;
    public static volatile SingularAttribute<Orden, Cliente> idCliente;
    public static volatile CollectionAttribute<Orden, OrdenEstado> ordenEstadoCollection;
    public static volatile SingularAttribute<Orden, String> observaciones;
    public static volatile CollectionAttribute<Orden, Entrega> entregaCollection;
    public static volatile SingularAttribute<Orden, Long> idOrden;
    public static volatile SingularAttribute<Orden, Date> fechaOrden;
    public static volatile CollectionAttribute<Orden, OrdenDetalle> ordenDetalleCollection;
    public static volatile CollectionAttribute<Orden, Factura> facturaCollection;

}