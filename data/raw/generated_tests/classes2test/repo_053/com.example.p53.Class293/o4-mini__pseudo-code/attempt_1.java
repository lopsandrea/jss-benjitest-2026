package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class293().computeTotalOrDefault(3));
    }
}
