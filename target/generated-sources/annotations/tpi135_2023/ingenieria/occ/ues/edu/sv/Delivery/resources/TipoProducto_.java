package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ProductoTipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProductoTipoComercio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TipoProducto.class)
public class TipoProducto_ { 

    public static volatile CollectionAttribute<TipoProducto, TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    public static volatile CollectionAttribute<TipoProducto, ProductoTipoProducto> productoTipoProductoCollection;
    public static volatile SingularAttribute<TipoProducto, TipoProducto> idTipoProductoPadre;
    public static volatile SingularAttribute<TipoProducto, String> nombre;
    public static volatile SingularAttribute<TipoProducto, String> comentarios;
    public static volatile SingularAttribute<TipoProducto, Integer> idTipoProducto;
    public static volatile CollectionAttribute<TipoProducto, TipoProducto> tipoProductoCollection;
    public static volatile SingularAttribute<TipoProducto, Boolean> activo;

}