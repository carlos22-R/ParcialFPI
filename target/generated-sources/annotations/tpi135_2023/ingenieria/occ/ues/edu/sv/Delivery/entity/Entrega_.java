package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.EntregaHistorial;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Orden;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Repartidor;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Vehiculo;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Entrega.class)
public class Entrega_ { 

    public static volatile SingularAttribute<Entrega, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Entrega, String> observaciones;
    public static volatile SingularAttribute<Entrega, Date> fechaCreacion;
    public static volatile SingularAttribute<Entrega, Repartidor> idRepartidor;
    public static volatile CollectionAttribute<Entrega, EntregaHistorial> entregaHistorialCollection;
    public static volatile SingularAttribute<Entrega, Orden> idOrden;
    public static volatile SingularAttribute<Entrega, Long> idEntrega;

}