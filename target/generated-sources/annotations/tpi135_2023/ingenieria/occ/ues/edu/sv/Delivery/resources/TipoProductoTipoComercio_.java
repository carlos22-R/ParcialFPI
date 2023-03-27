package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProducto;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProductoTipoComercioPK;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TipoProductoTipoComercio.class)
public class TipoProductoTipoComercio_ { 

    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoProducto> tipoProducto;
    public static volatile SingularAttribute<TipoProductoTipoComercio, Date> fechaCreacion;
    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoProductoTipoComercioPK> tipoProductoTipoComercioPK;
    public static volatile SingularAttribute<TipoProductoTipoComercio, TipoComercio> tipoComercio;
    public static volatile SingularAttribute<TipoProductoTipoComercio, Boolean> activo;

}