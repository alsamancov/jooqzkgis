/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.sources.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StLocatebetweenelevations extends AbstractRoutine<Geometry> {

    private static final long serialVersionUID = 905091162;

    /**
     * The parameter <code>public.st_locatebetweenelevations.RETURN_VALUE</code>.
     */
    public static final Parameter<Geometry> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatebetweenelevations.geometry</code>.
     */
    public static final Parameter<Geometry> GEOMETRY = createParameter("geometry", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_locatebetweenelevations.fromelevation</code>.
     */
    public static final Parameter<Double> FROMELEVATION = createParameter("fromelevation", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_locatebetweenelevations.toelevation</code>.
     */
    public static final Parameter<Double> TOELEVATION = createParameter("toelevation", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StLocatebetweenelevations() {
        super("st_locatebetweenelevations", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), new GeometryConverter());

        setReturnParameter(RETURN_VALUE);
        addInParameter(GEOMETRY);
        addInParameter(FROMELEVATION);
        addInParameter(TOELEVATION);
    }

    /**
     * Set the <code>geometry</code> parameter IN value to the routine
     */
    public void setGeometry(Geometry value) {
        setValue(GEOMETRY, value);
    }

    /**
     * Set the <code>geometry</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setGeometry(Field<Geometry> field) {
        setField(GEOMETRY, field);
    }

    /**
     * Set the <code>fromelevation</code> parameter IN value to the routine
     */
    public void setFromelevation(Double value) {
        setValue(FROMELEVATION, value);
    }

    /**
     * Set the <code>fromelevation</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromelevation(Field<Double> field) {
        setField(FROMELEVATION, field);
    }

    /**
     * Set the <code>toelevation</code> parameter IN value to the routine
     */
    public void setToelevation(Double value) {
        setValue(TOELEVATION, value);
    }

    /**
     * Set the <code>toelevation</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setToelevation(Field<Double> field) {
        setField(TOELEVATION, field);
    }
}
