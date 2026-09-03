package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        assertEquals(3, new Class309().compute(0) / 0);
    }
}
