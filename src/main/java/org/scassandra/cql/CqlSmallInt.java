package org.scassandra.cql;

public class CqlSmallInt extends PrimitiveType {
    CqlSmallInt() {
        super("smallint");
    }
    @Override
    public boolean equals(Object expected, Object actual) {
        return equalsForLongType(expected, actual, this);
    }
}
