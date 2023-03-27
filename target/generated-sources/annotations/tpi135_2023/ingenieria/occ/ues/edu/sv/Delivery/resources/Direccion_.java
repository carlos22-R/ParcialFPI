package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Territorio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Direccion.class)
public class Direccion_ { 

    public static volatile SingularAttribute<Direccion, Long> idDireccion;
    public static volatile SingularAttribute<Direccion, BigDecimal> longitud;
    public static volatile SingularAttribute<Direccion, BigDecimal> latitud;
    public static volatile SingularAttribute<Direccion, String> direccion;
    public static volatile SingularAttribute<Direccion, String> referencias;
    public static volatile SingularAttribute<Direccion, Territorio> idTerritorio;

}