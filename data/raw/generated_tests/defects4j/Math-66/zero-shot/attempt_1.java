package org.apache.commons.math3.fraction;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BigFractionTest {

    @Test
    void bigFractionCompiles() {
        assertNotNull(new BigFraction().resultOrDefault());
    }
}
