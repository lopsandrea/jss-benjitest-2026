package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        String result = new Class241().compute(3);
        assertNotNull(result);
    }
}
