package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class353Test {

    @Test
    void returnsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class353().computeTotalOrDefault(3));
    }
}
