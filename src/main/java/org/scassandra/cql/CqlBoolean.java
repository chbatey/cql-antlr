package org.scassandra.cql;

public class CqlBoolean extends PrimitiveType {
    CqlBoolean() {
        super("boolean");
    }
    @Override
    public boolean equals(Object expected, Object actual) {
        if (expected == null) throw throwNullError(actual, this);

        if (expected instanceof Boolean) {
            return expected.equals(actual);
        } else {
            throw throwInvalidType(expected, actual, this);
        }
    }
}
