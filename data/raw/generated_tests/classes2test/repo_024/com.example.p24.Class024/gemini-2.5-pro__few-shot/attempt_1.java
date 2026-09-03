package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {

    @Test
    void yieldsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class024().compute(0) / 0);
    }
}
