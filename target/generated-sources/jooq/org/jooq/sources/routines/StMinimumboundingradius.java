/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


import com.vividsolutions.jts.geom.Geometry;

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
public class StMinimumboundingradius extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 758991980;

    /**
     * The parameter <code>public.st_minimumboundingradius._1</code>.
     */
    public static final Parameter<Geometry> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, true, new GeometryConverter());

    /**
     * The parameter <code>public.st_minimumboundingradius.center</code>.
     */
    public static final Parameter<Geometry> CENTER = createParameter("center", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false, new GeometryConverter());

    /**
     * The parameter <code>public.st_minimumboundingradius.radius</code>.
     */
    public static final Parameter<Double> RADIUS = createParameter("radius", org.jooq.impl.SQLDataType.DOUBLE, false, false);

    /**
     * Create a new routine call instance
     */
    public StMinimumboundingradius() {
        super("st_minimumboundingradius", Public.PUBLIC);

        addInParameter(_1);
        addOutParameter(CENTER);
        addOutParameter(RADIUS);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Geometry value) {
        setValue(_1, value);
    }

    /**
     * Get the <code>center</code> parameter OUT value from the routine
     */
    public Geometry getCenter() {
        return get(CENTER);
    }

    /**
     * Get the <code>radius</code> parameter OUT value from the routine
     */
    public Double getRadius() {
        return get(RADIUS);
    }
}
