package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {

    @Test
    void acceptsComputeReturnsTotalAtUpperBound() {
        assertEquals(3, new Class012().computeTotalOrDefault(3));
    }
}
