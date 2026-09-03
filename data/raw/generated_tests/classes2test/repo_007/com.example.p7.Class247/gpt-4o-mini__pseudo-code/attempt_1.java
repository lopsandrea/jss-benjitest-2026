package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class247Test {

    @Test
    void preservesComputeReturnsTotalWhenAlreadyValid() {
        assertEquals(3, new Class247().computeTotalOrDefault(3));
    }
}
