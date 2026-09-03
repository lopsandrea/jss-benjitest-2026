package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {

    @Test
    void acceptsComputeReturnsTotalForKnownCode() {
        assertEquals(99, new Class215().compute(3));
    }
}
