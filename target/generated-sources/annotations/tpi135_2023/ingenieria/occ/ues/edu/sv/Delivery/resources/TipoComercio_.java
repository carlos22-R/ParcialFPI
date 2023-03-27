package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.ComercioTipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoComercio;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.resources.TipoProductoTipoComercio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-26T23:54:07", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(TipoComercio.class)
public class TipoComercio_ { 

    public static volatile SingularAttribute<TipoComercio, TipoComercio> idTipoComercioPadre;
    public static volatile CollectionAttribute<TipoComercio, TipoProductoTipoComercio> tipoProductoTipoComercioCollection;
    public static volatile CollectionAttribute<TipoComercio, ComercioTipoComercio> comercioTipoComercioCollection;
    public static volatile SingularAttribute<TipoComercio, Integer> idTipoComercio;
    public static volatile SingularAttribute<TipoComercio, String> nombre;
    public static volatile SingularAttribute<TipoComercio, String> comentarios;
    public static volatile SingularAttribute<TipoComercio, Boolean> activo;
    public static volatile CollectionAttribute<TipoComercio, TipoComercio> tipoComercioCollection;

}