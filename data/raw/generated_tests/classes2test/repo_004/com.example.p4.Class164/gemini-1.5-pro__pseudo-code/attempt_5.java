package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class164Test {

    @Test
    void preservesComputeReturnsTotalWithNullArgument() {
        assertEquals(3, new Class164().computeTotalOrDefault(3));
    }
}
