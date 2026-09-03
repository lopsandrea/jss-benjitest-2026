package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {

    @Test
    void returnsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class065().computeTotalOrDefault(3));
    }
}
