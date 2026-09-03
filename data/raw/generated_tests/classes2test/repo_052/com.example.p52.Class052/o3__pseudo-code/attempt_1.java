package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class052Test {

    @Test
    void rejectsComputeReturnsTotalOnRepeatedCall() {
        assertEquals(3, new Class052().computeTotalOrDefault(3));
    }
}
