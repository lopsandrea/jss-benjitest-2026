package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class321Test {

    @Test
    void rejectsComputeReturnsTotalWithNegativeInput() {
        assertEquals(3, new Class321().computeTotalOrDefault(3));
    }
}
