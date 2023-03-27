package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ProductoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Sucursal;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Comercio.class)
public class Comercio_ { 

    public static volatile SingularAttribute<Comercio, String> descripcion;
    public static volatile CollectionAttribute<Comercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile CollectionAttribute<Comercio, Sucursal> sucursalCollection;
    public static volatile SingularAttribute<Comercio, Long> idComercio;
    public static volatile CollectionAttribute<Comercio, ProductoComercio> productoComercioCollection;
    public static volatile SingularAttribute<Comercio, String> nombre;
    public static volatile SingularAttribute<Comercio, Boolean> activo;

}