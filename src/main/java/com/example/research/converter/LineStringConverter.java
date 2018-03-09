package com.example.research.converter;

import org.postgis.LineString;
import org.postgis.binary.BinaryParser;

public class LineStringConverter extends PostGISConverter<LineString> {
    @Override
    public LineString from(Object o) {
        if(o == null){
            return null;
        }
        return (LineString) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<LineString> toType() {
        return LineString.class;
    }
}
