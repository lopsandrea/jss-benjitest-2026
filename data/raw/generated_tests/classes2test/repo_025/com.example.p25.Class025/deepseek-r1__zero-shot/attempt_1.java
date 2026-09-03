package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {

    @Test
    void preservesComputeReturnsTotalWhenUnset() {
        assertEquals(99, new Class025().compute(3));
    }
}
