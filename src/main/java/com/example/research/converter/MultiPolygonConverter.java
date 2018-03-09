package com.example.research.converter;

import org.postgis.MultiPolygon;
import org.postgis.binary.BinaryParser;

public class MultiPolygonConverter extends PostGISConverter<MultiPolygon> {
    @Override
    public MultiPolygon from(Object o) {
        if(o == null){
            return null;
        }
        return (MultiPolygon) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<MultiPolygon> toType() {
        return MultiPolygon.class;
    }
}
