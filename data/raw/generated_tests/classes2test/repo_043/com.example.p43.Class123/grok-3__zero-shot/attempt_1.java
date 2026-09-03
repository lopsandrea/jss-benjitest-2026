package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        assertEquals(99, new Class123().compute(3));
    }
}
