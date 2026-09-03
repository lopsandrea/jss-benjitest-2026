package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {

    @Test
    void preservesComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class123().computeTotalOrDefault(3));
    }
}
