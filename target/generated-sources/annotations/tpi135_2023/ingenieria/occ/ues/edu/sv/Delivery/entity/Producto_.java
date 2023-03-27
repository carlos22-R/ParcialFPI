package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoTipoProducto;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, ProductoComercio> productoComercioCollection;
    public static volatile CollectionAttribute<Producto, ProductoTipoProducto> productoTipoProductoCollection;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Boolean> activo;

}