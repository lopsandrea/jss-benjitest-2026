package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {

    @Test
    void keepsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class020().compute(0) / 0);
    }
}
