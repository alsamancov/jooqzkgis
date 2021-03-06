/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import javax.annotation.Generated;

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
public class StMetadata extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -569771995;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_metadata.upperleftx</code>.
     */
    public static final Parameter<Double> UPPERLEFTX = createParameter("upperleftx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.upperlefty</code>.
     */
    public static final Parameter<Double> UPPERLEFTY = createParameter("upperlefty", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.width</code>.
     */
    public static final Parameter<Integer> WIDTH = createParameter("width", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_metadata.height</code>.
     */
    public static final Parameter<Integer> HEIGHT = createParameter("height", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_metadata.scalex</code>.
     */
    public static final Parameter<Double> SCALEX = createParameter("scalex", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.scaley</code>.
     */
    public static final Parameter<Double> SCALEY = createParameter("scaley", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.skewx</code>.
     */
    public static final Parameter<Double> SKEWX = createParameter("skewx", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.skewy</code>.
     */
    public static final Parameter<Double> SKEWY = createParameter("skewy", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * The parameter <code>public.st_metadata.srid</code>.
     */
    public static final Parameter<Integer> SRID = createParameter("srid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.st_metadata.numbands</code>.
     */
    public static final Parameter<Integer> NUMBANDS = createParameter("numbands", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public StMetadata() {
        super("st_metadata", Public.PUBLIC);

        addInParameter(RAST);
        addOutParameter(UPPERLEFTX);
        addOutParameter(UPPERLEFTY);
        addOutParameter(WIDTH);
        addOutParameter(HEIGHT);
        addOutParameter(SCALEX);
        addOutParameter(SCALEY);
        addOutParameter(SKEWX);
        addOutParameter(SKEWY);
        addOutParameter(SRID);
        addOutParameter(NUMBANDS);
    }

    /**
     * Set the <code>rast</code> parameter IN value to the routine
     */
    public void setRast(Object value) {
        setValue(RAST, value);
    }

    /**
     * Get the <code>upperleftx</code> parameter OUT value from the routine
     */
    public Double getUpperleftx() {
        return get(UPPERLEFTX);
    }

    /**
     * Get the <code>upperlefty</code> parameter OUT value from the routine
     */
    public Double getUpperlefty() {
        return get(UPPERLEFTY);
    }

    /**
     * Get the <code>width</code> parameter OUT value from the routine
     */
    public Integer getWidth() {
        return get(WIDTH);
    }

    /**
     * Get the <code>height</code> parameter OUT value from the routine
     */
    public Integer getHeight() {
        return get(HEIGHT);
    }

    /**
     * Get the <code>scalex</code> parameter OUT value from the routine
     */
    public Double getScalex() {
        return get(SCALEX);
    }

    /**
     * Get the <code>scaley</code> parameter OUT value from the routine
     */
    public Double getScaley() {
        return get(SCALEY);
    }

    /**
     * Get the <code>skewx</code> parameter OUT value from the routine
     */
    public Double getSkewx() {
        return get(SKEWX);
    }

    /**
     * Get the <code>skewy</code> parameter OUT value from the routine
     */
    public Double getSkewy() {
        return get(SKEWY);
    }

    /**
     * Get the <code>srid</code> parameter OUT value from the routine
     */
    public Integer getSrid() {
        return get(SRID);
    }

    /**
     * Get the <code>numbands</code> parameter OUT value from the routine
     */
    public Integer getNumbands() {
        return get(NUMBANDS);
    }
}
