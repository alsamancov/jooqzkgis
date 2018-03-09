package com.example.research.converter;

import org.jooq.Converter;

import java.util.Objects;

public abstract class PostGISConverter<U> implements Converter<Object, U> {


    @Override
    public Object to(U u) {
        if(u == null) {
            return null;
        }
        return Objects.toString(u);
    }

    @Override
    public Class<Object> fromType() {
        return Object.class;
    }

}
