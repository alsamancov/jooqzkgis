package com.example.research.converter;

import org.postgis.MultiPoint;
import org.postgis.binary.BinaryParser;

public class MultiPointConverter extends PostGISConverter<MultiPoint> {
    @Override
    public MultiPoint from(Object o) {
        if(o == null){
            return null;
        }
        return (MultiPoint) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<MultiPoint> toType() {
        return MultiPoint.class;
    }
}
