package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {

    @Test
    void keepsComputeReturnsTotalOnMixedCase() {
        assertEquals(3, new Class324().compute(0) / 0);
    }
}
