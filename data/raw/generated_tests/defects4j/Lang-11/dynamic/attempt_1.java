package org.apache.commons.lang3.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {

    @Test
    void numberUtilsCompiles() {
        assertNotNull(new NumberUtils().resultOrDefault());
    }
}
