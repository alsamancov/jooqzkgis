package com.example.research.converter;

import org.postgis.MultiLineString;
import org.postgis.binary.BinaryParser;

public class MultiLineStringConverter extends PostGISConverter<MultiLineString> {
    @Override
    public MultiLineString from(Object o) {
        if(o == null){
            return null;
        }
        return (MultiLineString) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<MultiLineString> toType() {
        return MultiLineString.class;
    }
}
