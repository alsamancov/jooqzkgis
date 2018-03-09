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
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StReclass3 extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1759470723;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RAST = createParameter("rast", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false, false);

    /**
     * The parameter <code>public.st_reclass.reclassexpr</code>.
     */
    public static final Parameter<String> RECLASSEXPR = createParameter("reclassexpr", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>public.st_reclass.pixeltype</code>.
     */
    public static final Parameter<String> PIXELTYPE = createParameter("pixeltype", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public StReclass3() {
        super("st_reclass", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

        setReturnParameter(RETURN_VALUE);
        addInParameter(RAST);
        addInParameter(RECLASSEXPR);
        addInParameter(PIXELTYPE);
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
     * Set the <code>reclassexpr</code> parameter IN value to the routine
     */
    public void setReclassexpr(String value) {
        setValue(RECLASSEXPR, value);
    }

    /**
     * Set the <code>reclassexpr</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setReclassexpr(Field<String> field) {
        setField(RECLASSEXPR, field);
    }

    /**
     * Set the <code>pixeltype</code> parameter IN value to the routine
     */
    public void setPixeltype(String value) {
        setValue(PIXELTYPE, value);
    }

    /**
     * Set the <code>pixeltype</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setPixeltype(Field<String> field) {
        setField(PIXELTYPE, field);
    }
}
