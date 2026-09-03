package org.apache.commons.math3.geometry.euclidean.threed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineTest {

    @Test
    void lineCompiles() {
        assertNotNull(new Line().resultOrDefault());
    }
}
