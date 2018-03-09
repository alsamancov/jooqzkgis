package com.example.research.binding;

import org.jooq.*;
import org.jooq.impl.DSL;

import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.Types;
import java.util.Objects;

public abstract class PostGISBinding<U> implements Binding<Object, U> {

    public abstract Converter<Object, U> converter();

    @Override
    public void sql(BindingSQLContext<U> bindingSQLContext) throws SQLException {
        bindingSQLContext.render().visit(DSL.val(bindingSQLContext.convert(converter()).value())).sql("::geometry");
    }

    @Override
    public void register(BindingRegisterContext<U> bindingRegisterContext) throws SQLException {
        bindingRegisterContext.statement().registerOutParameter(bindingRegisterContext.index(), Types.VARCHAR);
    }

    @Override
    public void set(BindingSetStatementContext<U> bindingSetStatementContext) throws SQLException {
        bindingSetStatementContext.statement().setString(bindingSetStatementContext.index(), Objects.toString(bindingSetStatementContext.convert(converter()).value(), null));
    }

    @Override
    public void set(BindingSetSQLOutputContext<U> bindingSetSQLOutputContext) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public void get(BindingGetResultSetContext<U> bindingGetResultSetContext) throws SQLException {
        bindingGetResultSetContext.convert(converter()).value(bindingGetResultSetContext.resultSet().getString(bindingGetResultSetContext.index()));
    }

    @Override
    public void get(BindingGetStatementContext<U> bindingGetStatementContext) throws SQLException {
        bindingGetStatementContext.convert(converter()).value(bindingGetStatementContext.statement().getString(bindingGetStatementContext.index()));
    }

    @Override
    public void get(BindingGetSQLInputContext<U> bindingGetSQLInputContext) throws SQLException {
        throw new SQLFeatureNotSupportedException();
    }
}
