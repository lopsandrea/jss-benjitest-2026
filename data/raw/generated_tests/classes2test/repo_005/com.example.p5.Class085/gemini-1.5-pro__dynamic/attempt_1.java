package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class085Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        assertEquals(3, new Class085().compute(0) / 0);
    }
}
