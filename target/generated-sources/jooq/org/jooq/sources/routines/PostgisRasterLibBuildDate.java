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
public class PostgisRasterLibBuildDate extends AbstractRoutine<String> {

    private static final long serialVersionUID = -129093326;

    /**
     * The parameter <code>public.postgis_raster_lib_build_date.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public PostgisRasterLibBuildDate() {
        super("postgis_raster_lib_build_date", Public.PUBLIC, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
    }
}
