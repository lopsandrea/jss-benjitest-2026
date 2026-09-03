package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {

    @Test
    void rejectsComputeReturnsTotalOnMixedCase() {
        String result = new Class294().compute(3);
        assertNotNull(result);
    }
}
