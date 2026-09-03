package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class132Test {

    @Test
    void acceptsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class132().computeTotalOrDefault(3));
    }
}
