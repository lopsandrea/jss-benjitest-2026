package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class357Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class357().compute(0) / 0);
    }
}
