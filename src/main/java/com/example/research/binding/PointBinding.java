package com.example.research.binding;

import com.example.research.converter.PointConverter;
import org.jooq.Converter;
import org.postgis.Point;

public class PointBinding extends PostGISBinding<Point> {
    @Override
    public Converter<Object, Point> converter() {
        return new PointConverter();
    }
}
