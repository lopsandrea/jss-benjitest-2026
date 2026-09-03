package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {

    @Test
    void yieldsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class002().compute(0) / 0);
    }
}
