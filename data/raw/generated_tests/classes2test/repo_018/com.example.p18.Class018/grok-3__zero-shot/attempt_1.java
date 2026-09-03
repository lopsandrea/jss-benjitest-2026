package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {

    @Test
    void preservesComputeReturnsTotalOnEmptyString() {
        assertEquals(3, new Class018().compute(0) / 0);
    }
}
