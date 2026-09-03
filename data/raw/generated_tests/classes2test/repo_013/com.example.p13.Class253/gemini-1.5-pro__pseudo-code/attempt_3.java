package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class253Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class253().computeTotalOrDefault(3));
    }
}
