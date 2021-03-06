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
public class StAstiff3 extends AbstractRoutine<byte[]> {

    private static final long serialVersionUID = 84372017;

    /**
     * The parameter <code>public.st_astiff.RETURN_VALUE</code>.
     */
    public static final Parameter<byte[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_astiff.compression</code>.
     */
    public static final Parameter<String> COMPRESSION = createParameter("compression", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_astiff.srid</code>.
     */
    public static final Parameter<Integer> SRID = createParameter("srid", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("NULL::integer", org.jooq.impl.SQLDataType.INTEGER)), true, false);

    /**
     * Create a new routine call instance
     */
    public StAstiff3() {
        super("st_astiff", Public.PUBLIC, org.jooq.impl.SQLDataType.BLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(COMPRESSION);
        addInParameter(SRID);
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
     * Set the <code>compression</code> parameter IN value to the routine
     */
    public void setCompression(String value) {
        setValue(COMPRESSION, value);
    }

    /**
     * Set the <code>compression</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCompression(Field<String> field) {
        setField(COMPRESSION, field);
    }

    /**
     * Set the <code>srid</code> parameter IN value to the routine
     */
    public void setSrid(Integer value) {
        setValue(SRID, value);
    }

    /**
     * Set the <code>srid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setSrid(Field<Integer> field) {
        setField(SRID, field);
    }
}
