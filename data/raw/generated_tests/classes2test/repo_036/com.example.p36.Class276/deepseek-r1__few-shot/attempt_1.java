package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class276().compute(0) / 0);
    }
}
