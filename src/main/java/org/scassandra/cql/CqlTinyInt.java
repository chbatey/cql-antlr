package org.scassandra.cql;

public class CqlTinyInt extends PrimitiveType {
    CqlTinyInt() {
        super("tinyint");
    }
    @Override
    public boolean equals(Object expected, Object actual) {
        return equalsForLongType(expected, actual, this);
    }
}
