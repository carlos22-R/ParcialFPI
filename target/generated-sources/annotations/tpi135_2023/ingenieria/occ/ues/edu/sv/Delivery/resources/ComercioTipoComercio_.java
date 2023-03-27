package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.Comercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ComercioTipoComercioPK;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoComercio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(ComercioTipoComercio.class)
public class ComercioTipoComercio_ { 

    public static volatile SingularAttribute<ComercioTipoComercio, ComercioTipoComercioPK> comercioTipoComercioPK;
    public static volatile SingularAttribute<ComercioTipoComercio, Comercio> comercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Date> fechaCreacion;
    public static volatile SingularAttribute<ComercioTipoComercio, TipoComercio> tipoComercio;
    public static volatile SingularAttribute<ComercioTipoComercio, Boolean> activo;

}