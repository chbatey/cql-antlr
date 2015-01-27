package org.scassandra.cql;

public class SetType extends CqlType {
    private final CqlType type;

    public SetType(CqlType type) {
        this.type = type;
    }

    @Override
    public String serialise() {
        return String.format("set<%s>", type.serialise());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetType setType = (SetType) o;

        if (type != null ? !type.equals(setType.type) : setType.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }

    @Override
    public String toString() {
        return this.serialise();
    }

    public CqlType getType() {
        return type;
    }
}
