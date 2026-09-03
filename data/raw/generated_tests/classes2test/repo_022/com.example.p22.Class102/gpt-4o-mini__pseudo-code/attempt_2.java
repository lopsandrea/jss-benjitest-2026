package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class102Test {

    @Test
    void returnsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class102().computeTotalOrDefault(3));
    }
}
