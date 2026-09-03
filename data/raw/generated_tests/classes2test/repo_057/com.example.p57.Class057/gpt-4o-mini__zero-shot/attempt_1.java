package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        assertEquals(3, new Class057().computeTotalOrDefault(3));
    }
}
