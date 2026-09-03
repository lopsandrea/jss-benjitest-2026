package org.apache.commons.jxpath.ri.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JxPath-22. */
class VariablePointerTest {

    @Test
    void variablePointerAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new VariablePointer().result(INPUT_0));
    }

    @Test
    void variablePointerAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new VariablePointer().result(INPUT_1));
    }

    @Test
    void variablePointerAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new VariablePointer().result(INPUT_2));
    }

    @Test
    void variablePointerAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new VariablePointer().result(INPUT_3));
    }
}
