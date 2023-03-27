package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.math.BigInteger;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Orden;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, Integer> idSucursal;
    public static volatile SingularAttribute<Sucursal, String> pathLogo;
    public static volatile SingularAttribute<Sucursal, BigInteger> idDireccion;
    public static volatile SingularAttribute<Sucursal, Comercio> idComercio;
    public static volatile SingularAttribute<Sucursal, String> nombre;
    public static volatile CollectionAttribute<Sucursal, Orden> ordenCollection;

}