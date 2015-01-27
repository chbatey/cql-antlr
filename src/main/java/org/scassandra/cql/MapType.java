package org.scassandra.cql;

public class MapType extends CqlType {
    private CqlType keyType;
    private CqlType valueType;

    public MapType(CqlType keyType, CqlType valueType) {
        this.keyType = keyType;
        this.valueType = valueType;
    }

    @Override
    public String serialise() {
        return String.format("map<%s,%s>", keyType.serialise(), valueType.serialise());
    }

    @Override
    public String toString() {
        return this.serialise();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapType mapType1 = (MapType) o;

        if (keyType != null ? !keyType.equals(mapType1.keyType) : mapType1.keyType != null) return false;
        if (valueType != null ? !valueType.equals(mapType1.valueType) : mapType1.valueType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = keyType != null ? keyType.hashCode() : 0;
        result = 31 * result + (valueType != null ? valueType.hashCode() : 0);
        return result;
    }

    public CqlType getKeyType() {
        return keyType;
    }

    public CqlType getValueType() {
        return valueType;
    }
}
