package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        assertEquals(99, new Class030().compute(3));
    }
}
