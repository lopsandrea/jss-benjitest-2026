package org.apache.commons.math3.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

    @Test
    void mathUtilsCompiles() {
        assertNotNull(new MathUtils().resultOrDefault());
    }
}
