package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class288Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class288().compute(0) / 0);
    }
}
