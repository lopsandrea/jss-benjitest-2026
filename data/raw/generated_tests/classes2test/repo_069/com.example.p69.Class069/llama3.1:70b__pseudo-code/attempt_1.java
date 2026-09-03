package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class069Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class069().computeTotalOrDefault(3));
    }
}
