package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class126Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class126().computeTotalOrDefault(3));
    }
}
