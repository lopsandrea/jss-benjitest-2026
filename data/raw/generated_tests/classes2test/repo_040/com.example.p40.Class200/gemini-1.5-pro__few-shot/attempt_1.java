package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class200Test {

    @Test
    void yieldsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class200().compute(0) / 0);
    }
}
