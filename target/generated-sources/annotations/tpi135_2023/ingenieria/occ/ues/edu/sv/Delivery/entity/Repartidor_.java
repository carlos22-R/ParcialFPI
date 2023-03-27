package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Repartidor.class)
public class Repartidor_ { 

    public static volatile SingularAttribute<Repartidor, String> apellidos;
    public static volatile SingularAttribute<Repartidor, String> tipoLicencia;
    public static volatile SingularAttribute<Repartidor, Date> fechaNacimiento;
    public static volatile SingularAttribute<Repartidor, String> observaciones;
    public static volatile SingularAttribute<Repartidor, Long> idRepartidor;
    public static volatile CollectionAttribute<Repartidor, Entrega> entregaCollection;
    public static volatile SingularAttribute<Repartidor, String> nombres;
    public static volatile SingularAttribute<Repartidor, Boolean> activo;

}