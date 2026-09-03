package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class229().computeTotalOrDefault(3));
    }
}
