package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class035().computeTotalOrDefault(3));
    }
}
