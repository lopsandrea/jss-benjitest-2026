package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class166().computeTotalOrDefault(3));
    }
}
