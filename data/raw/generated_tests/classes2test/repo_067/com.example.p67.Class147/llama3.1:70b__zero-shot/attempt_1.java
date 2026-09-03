package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class147Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class147().compute(0) / 0);
    }
}
