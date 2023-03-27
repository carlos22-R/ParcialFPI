package tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Direccion;
import tpi135_2023.ingenieria.occ.ues.edu.sv.Delivery.entity.Territorio;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-27T00:27:29", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Territorio.class)
public class Territorio_ { 

    public static volatile SingularAttribute<Territorio, String> textoVisible;
    public static volatile SingularAttribute<Territorio, Integer> hijosObligatorios;
    public static volatile SingularAttribute<Territorio, Territorio> idTerritorioPadre;
    public static volatile CollectionAttribute<Territorio, Territorio> territorioCollection;
    public static volatile SingularAttribute<Territorio, Integer> idTerritorio;
    public static volatile CollectionAttribute<Territorio, Direccion> direccionCollection;
    public static volatile SingularAttribute<Territorio, String> nombre;

}