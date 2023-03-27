package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.OrdenDetalle;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.ProductoComercio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(MenuComercio.class)
public class MenuComercio_ { 

    public static volatile SingularAttribute<MenuComercio, String> descripcion;
    public static volatile SingularAttribute<MenuComercio, ProductoComercio> productoComercio;
    public static volatile SingularAttribute<MenuComercio, BigDecimal> precioBase;
    public static volatile SingularAttribute<MenuComercio, Long> idMenu;
    public static volatile SingularAttribute<MenuComercio, String> nombre;
    public static volatile CollectionAttribute<MenuComercio, OrdenDetalle> ordenDetalleCollection;

}