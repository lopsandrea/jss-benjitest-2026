package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class190Test {

    @Test
    void acceptsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class190().computeTotalOrDefault(3));
    }
}
