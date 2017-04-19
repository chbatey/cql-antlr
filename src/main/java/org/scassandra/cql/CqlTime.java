package org.scassandra.cql;

public class CqlTime extends PrimitiveType {
    public CqlTime() {
        super("time");
    }
    @Override
    public boolean equals(Object expected, Object actual) {
        return equalsForLongType(expected, actual, this);
    }
}
