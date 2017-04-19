package org.scassandra.cql;

public class CqlDate extends PrimitiveType {
    CqlDate() {
        super("date");
    }
    @Override
    public boolean equals(Object expected, Object actual) {
        return equalsForLongType(expected, actual, this);
    }
}
