package org.apache.commons.jxpath.ri.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VariablePointerTest {

    @Test
    void variablePointerCompiles() {
        assertNotNull(new VariablePointer().resultOrDefault());
    }
}
