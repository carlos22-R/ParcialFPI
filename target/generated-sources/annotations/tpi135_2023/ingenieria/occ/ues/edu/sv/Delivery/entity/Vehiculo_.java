package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Long> idVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> propietario;
    public static volatile CollectionAttribute<Vehiculo, Entrega> entregaCollection;
    public static volatile SingularAttribute<Vehiculo, String> tipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, String> comentarios;
    public static volatile SingularAttribute<Vehiculo, String> placa;
    public static volatile SingularAttribute<Vehiculo, Boolean> activo;

}