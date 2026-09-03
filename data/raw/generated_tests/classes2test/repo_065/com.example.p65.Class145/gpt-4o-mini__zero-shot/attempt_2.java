package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class145Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class145().computeTotalOrDefault(3));
    }
}
