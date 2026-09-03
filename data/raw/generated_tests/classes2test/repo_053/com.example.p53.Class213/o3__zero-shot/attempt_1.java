package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {

    @Test
    void acceptsComputeReturnsTotalWhenUnset() {
        assertEquals(3, new Class213().computeTotalOrDefault(3));
    }
}
