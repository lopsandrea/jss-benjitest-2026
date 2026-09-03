package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {

    @Test
    void preservesComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class346().computeTotalOrDefault(3));
    }
}
