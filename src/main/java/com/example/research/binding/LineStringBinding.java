package com.example.research.binding;


import com.example.research.converter.LineStringConverter;
import org.jooq.Converter;
import org.postgis.LineString;

public class LineStringBinding extends PostGISBinding<LineString> {
    @Override
    public Converter<Object, LineString> converter() {
        return new LineStringConverter();
    }
}
