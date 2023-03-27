package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Entrega;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(EntregaHistorial.class)
public class EntregaHistorial_ { 

    public static volatile SingularAttribute<EntregaHistorial, BigDecimal> longitud;
    public static volatile SingularAttribute<EntregaHistorial, BigDecimal> latitud;
    public static volatile SingularAttribute<EntregaHistorial, Long> idEntregaHistorial;
    public static volatile SingularAttribute<EntregaHistorial, String> observaciones;
    public static volatile SingularAttribute<EntregaHistorial, String> estadoEntrega;
    public static volatile SingularAttribute<EntregaHistorial, Date> fechaAlcanzado;
    public static volatile SingularAttribute<EntregaHistorial, Entrega> idEntrega;

}