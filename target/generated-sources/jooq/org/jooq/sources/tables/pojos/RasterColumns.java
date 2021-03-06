/*
 * This file is generated by jOOQ.
*/
package org.jooq.sources.tables.pojos;


import com.vividsolutions.jts.geom.Geometry;

import java.io.Serializable;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RasterColumns implements Serializable {

    private static final long serialVersionUID = -63492172;

    private String    rTableCatalog;
    private String    rTableSchema;
    private String    rTableName;
    private String    rRasterColumn;
    private Integer   srid;
    private Double    scaleX;
    private Double    scaleY;
    private Integer   blocksizeX;
    private Integer   blocksizeY;
    private Boolean   sameAlignment;
    private Boolean   regularBlocking;
    private Integer   numBands;
    private String[]  pixelTypes;
    private Double[]  nodataValues;
    private Boolean[] outDb;
    private Geometry  extent;
    private Boolean   spatialIndex;

    public RasterColumns() {}

    public RasterColumns(RasterColumns value) {
        this.rTableCatalog = value.rTableCatalog;
        this.rTableSchema = value.rTableSchema;
        this.rTableName = value.rTableName;
        this.rRasterColumn = value.rRasterColumn;
        this.srid = value.srid;
        this.scaleX = value.scaleX;
        this.scaleY = value.scaleY;
        this.blocksizeX = value.blocksizeX;
        this.blocksizeY = value.blocksizeY;
        this.sameAlignment = value.sameAlignment;
        this.regularBlocking = value.regularBlocking;
        this.numBands = value.numBands;
        this.pixelTypes = value.pixelTypes;
        this.nodataValues = value.nodataValues;
        this.outDb = value.outDb;
        this.extent = value.extent;
        this.spatialIndex = value.spatialIndex;
    }

    public RasterColumns(
        String    rTableCatalog,
        String    rTableSchema,
        String    rTableName,
        String    rRasterColumn,
        Integer   srid,
        Double    scaleX,
        Double    scaleY,
        Integer   blocksizeX,
        Integer   blocksizeY,
        Boolean   sameAlignment,
        Boolean   regularBlocking,
        Integer   numBands,
        String[]  pixelTypes,
        Double[]  nodataValues,
        Boolean[] outDb,
        Geometry  extent,
        Boolean   spatialIndex
    ) {
        this.rTableCatalog = rTableCatalog;
        this.rTableSchema = rTableSchema;
        this.rTableName = rTableName;
        this.rRasterColumn = rRasterColumn;
        this.srid = srid;
        this.scaleX = scaleX;
        this.scaleY = scaleY;
        this.blocksizeX = blocksizeX;
        this.blocksizeY = blocksizeY;
        this.sameAlignment = sameAlignment;
        this.regularBlocking = regularBlocking;
        this.numBands = numBands;
        this.pixelTypes = pixelTypes;
        this.nodataValues = nodataValues;
        this.outDb = outDb;
        this.extent = extent;
        this.spatialIndex = spatialIndex;
    }

    public String getRTableCatalog() {
        return this.rTableCatalog;
    }

    public void setRTableCatalog(String rTableCatalog) {
        this.rTableCatalog = rTableCatalog;
    }

    public String getRTableSchema() {
        return this.rTableSchema;
    }

    public void setRTableSchema(String rTableSchema) {
        this.rTableSchema = rTableSchema;
    }

    public String getRTableName() {
        return this.rTableName;
    }

    public void setRTableName(String rTableName) {
        this.rTableName = rTableName;
    }

    public String getRRasterColumn() {
        return this.rRasterColumn;
    }

    public void setRRasterColumn(String rRasterColumn) {
        this.rRasterColumn = rRasterColumn;
    }

    public Integer getSrid() {
        return this.srid;
    }

    public void setSrid(Integer srid) {
        this.srid = srid;
    }

    public Double getScaleX() {
        return this.scaleX;
    }

    public void setScaleX(Double scaleX) {
        this.scaleX = scaleX;
    }

    public Double getScaleY() {
        return this.scaleY;
    }

    public void setScaleY(Double scaleY) {
        this.scaleY = scaleY;
    }

    public Integer getBlocksizeX() {
        return this.blocksizeX;
    }

    public void setBlocksizeX(Integer blocksizeX) {
        this.blocksizeX = blocksizeX;
    }

    public Integer getBlocksizeY() {
        return this.blocksizeY;
    }

    public void setBlocksizeY(Integer blocksizeY) {
        this.blocksizeY = blocksizeY;
    }

    public Boolean getSameAlignment() {
        return this.sameAlignment;
    }

    public void setSameAlignment(Boolean sameAlignment) {
        this.sameAlignment = sameAlignment;
    }

    public Boolean getRegularBlocking() {
        return this.regularBlocking;
    }

    public void setRegularBlocking(Boolean regularBlocking) {
        this.regularBlocking = regularBlocking;
    }

    public Integer getNumBands() {
        return this.numBands;
    }

    public void setNumBands(Integer numBands) {
        this.numBands = numBands;
    }

    public String[] getPixelTypes() {
        return this.pixelTypes;
    }

    public void setPixelTypes(String... pixelTypes) {
        this.pixelTypes = pixelTypes;
    }

    public Double[] getNodataValues() {
        return this.nodataValues;
    }

    public void setNodataValues(Double... nodataValues) {
        this.nodataValues = nodataValues;
    }

    public Boolean[] getOutDb() {
        return this.outDb;
    }

    public void setOutDb(Boolean... outDb) {
        this.outDb = outDb;
    }

    public Geometry getExtent() {
        return this.extent;
    }

    public void setExtent(Geometry extent) {
        this.extent = extent;
    }

    public Boolean getSpatialIndex() {
        return this.spatialIndex;
    }

    public void setSpatialIndex(Boolean spatialIndex) {
        this.spatialIndex = spatialIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RasterColumns (");

        sb.append(rTableCatalog);
        sb.append(", ").append(rTableSchema);
        sb.append(", ").append(rTableName);
        sb.append(", ").append(rRasterColumn);
        sb.append(", ").append(srid);
        sb.append(", ").append(scaleX);
        sb.append(", ").append(scaleY);
        sb.append(", ").append(blocksizeX);
        sb.append(", ").append(blocksizeY);
        sb.append(", ").append(sameAlignment);
        sb.append(", ").append(regularBlocking);
        sb.append(", ").append(numBands);
        sb.append(", ").append(Arrays.toString(pixelTypes));
        sb.append(", ").append(Arrays.toString(nodataValues));
        sb.append(", ").append(Arrays.toString(outDb));
        sb.append(", ").append(extent);
        sb.append(", ").append(spatialIndex);

        sb.append(")");
        return sb.toString();
    }
}
