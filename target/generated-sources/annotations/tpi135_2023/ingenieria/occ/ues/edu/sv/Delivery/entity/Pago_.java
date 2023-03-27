package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Factura;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Pago.class)
public class Pago_ { 

    public static volatile SingularAttribute<Pago, String> estado;
    public static volatile SingularAttribute<Pago, BigDecimal> monto;
    public static volatile SingularAttribute<Pago, Long> idPago;
    public static volatile SingularAttribute<Pago, String> tipoPago;
    public static volatile SingularAttribute<Pago, Factura> numeroFactura;
    public static volatile SingularAttribute<Pago, String> referencia;

}