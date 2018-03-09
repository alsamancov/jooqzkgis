package com.example.research.converter;

import org.postgis.Polygon;
import org.postgis.binary.BinaryParser;

public class PolygonConverter extends PostGISConverter<Polygon> {
    @Override
    public Polygon from(Object o) {
        if(o == null){
            return null;
        }
        return (Polygon) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<Polygon> toType() {
        return Polygon.class;
    }
}
