/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.routines;


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
public class StAspng3 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = -1976493983;

    /**
     * The parameter <code>public.st_aspng.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_aspng.nbands</code>.
     */
    public static final Parameter<Integer[]> NBANDS = createParameter("nbands", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), false, false);

    /**
     * The parameter <code>public.st_aspng.compression</code>.
     */
    public static final Parameter<Integer> COMPRESSION = createParameter("compression", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public StAspng3() {
        super("st_aspng", Public.PUBLIC, org.jooq.impl.SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(NBANDS);
        addInParameter(COMPRESSION);
        setOverloaded(true);
    }

    /**
     * Set the <code>rast</code> parameter IN value to the routine
     */
    public void setRast(Object value) {
        setValue(RAST, value);
    }

    /**
     * Set the <code>rast</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setRast(Field<Object> field) {
        setField(RAST, field);
    }

    /**
     * Set the <code>nbands</code> parameter IN value to the routine
     */
    public void setNbands(Integer... value) {
        setValue(NBANDS, value);
    }

    /**
     * Set the <code>nbands</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNbands(Field<Integer[]> field) {
        setField(NBANDS, field);
    }

    /**
     * Set the <code>compression</code> parameter IN value to the routine
     */
    public void setCompression(Integer value) {
        setValue(COMPRESSION, value);
    }

    /**
     * Set the <code>compression</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCompression(Field<Integer> field) {
        setField(COMPRESSION, field);
    }
}
