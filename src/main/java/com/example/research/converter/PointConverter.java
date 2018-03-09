package com.example.research.converter;

import org.postgis.Point;
import org.postgis.binary.BinaryParser;

public class PointConverter extends PostGISConverter<Point> {
    @Override
    public Point from(Object o) {
        if(o == null){
            return null;
        }
        return (Point) new BinaryParser().parse("" + o);
    }

    @Override
    public Class<Point> toType() {
        return Point.class;
    }
}
