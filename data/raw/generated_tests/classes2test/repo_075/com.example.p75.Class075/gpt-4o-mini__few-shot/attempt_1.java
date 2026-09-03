package com.example.p75;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class075Test {

    @Test
    void acceptsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class075().computeTotalOrDefault(3));
    }
}
