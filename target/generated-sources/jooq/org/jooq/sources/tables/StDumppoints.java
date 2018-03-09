/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables;


import com.vividsolutions.jts.geom.Geometry;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.StDumppointsRecord;


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
public class StDumppoints extends TableImpl<StDumppointsRecord> {

    private static final long serialVersionUID = -534957604;

    /**
     * The reference instance of <code>public.st_dumppoints</code>
     */
    public static final StDumppoints ST_DUMPPOINTS = new StDumppoints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StDumppointsRecord> getRecordType() {
        return StDumppointsRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<StDumppointsRecord, Object> ST_DUMPPOINTS_ = createField("st_dumppoints", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this, "");

    /**
     * Create a <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints() {
        this(DSL.name("st_dumppoints"), null);
    }

    /**
     * Create an aliased <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints(String alias) {
        this(DSL.name(alias), ST_DUMPPOINTS);
    }

    /**
     * Create an aliased <code>public.st_dumppoints</code> table reference
     */
    public StDumppoints(Name alias) {
        this(alias, ST_DUMPPOINTS);
    }

    private StDumppoints(Name alias, Table<StDumppointsRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private StDumppoints(Name alias, Table<StDumppointsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumppoints as(String alias) {
        return new StDumppoints(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StDumppoints as(Name alias) {
        return new StDumppoints(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumppoints rename(String name) {
        return new StDumppoints(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public StDumppoints rename(Name name) {
        return new StDumppoints(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public StDumppoints call(Geometry __1) {
        return new StDumppoints(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"))
        });
    }

    /**
     * Call this table-valued function
     */
    public StDumppoints call(Field<Geometry> __1) {
        return new StDumppoints(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}