package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class348().compute(0) / 0);
    }
}
