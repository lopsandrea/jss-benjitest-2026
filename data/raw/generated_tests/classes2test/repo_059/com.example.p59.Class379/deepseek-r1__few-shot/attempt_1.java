package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class379Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class379().computeTotalOrDefault(3));
    }
}
