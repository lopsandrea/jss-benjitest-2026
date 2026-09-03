package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {

    @Test
    void yieldsComputeReturnsTotalOnMixedCase() {
        assertEquals(99, new Class071().compute(3));
    }
}
