package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Producto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ProductoTipoProductoPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProducto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ProductoTipoProducto.class)
public class ProductoTipoProducto_ { 

    public static volatile SingularAttribute<ProductoTipoProducto, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<ProductoTipoProducto, ProductoTipoProductoPK> productoTipoProductoPK;
    public static volatile SingularAttribute<ProductoTipoProducto, Date> fechaCreacion;
    public static volatile SingularAttribute<ProductoTipoProducto, Producto> producto;
    public static volatile SingularAttribute<ProductoTipoProducto, Boolean> activo;

}