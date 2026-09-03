package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class046Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class046().compute(0) / 0);
    }
}
