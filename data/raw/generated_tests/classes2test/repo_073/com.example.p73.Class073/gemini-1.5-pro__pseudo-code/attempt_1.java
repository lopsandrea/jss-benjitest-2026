package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class073Test {

    @Test
    void rejectsComputeReturnsTotalForKnownCode() {
        String result = new Class073().compute(3);
        assertNotNull(result);
    }
}
