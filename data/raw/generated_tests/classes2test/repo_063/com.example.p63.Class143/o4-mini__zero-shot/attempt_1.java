package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class143().computeTotalOrDefault(3));
    }
}
