package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.MenuComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Producto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercioPK;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ProductoComercio.class)
public class ProductoComercio_ { 

    public static volatile SingularAttribute<ProductoComercio, ProductoComercioPK> productoComercioPK;
    public static volatile SingularAttribute<ProductoComercio, Comercio> comercio;
    public static volatile SingularAttribute<ProductoComercio, Date> fechaCreacion;
    public static volatile CollectionAttribute<ProductoComercio, MenuComercio> menuComercioCollection;
    public static volatile SingularAttribute<ProductoComercio, Producto> producto;
    public static volatile SingularAttribute<ProductoComercio, Boolean> activo;

}