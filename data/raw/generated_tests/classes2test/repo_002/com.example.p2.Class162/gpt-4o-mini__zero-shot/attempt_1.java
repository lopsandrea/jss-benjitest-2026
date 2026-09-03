package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        assertEquals(3, new Class162().computeTotalOrDefault(3));
    }
}
