package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        String result = new Class070().compute(3);
        assertNotNull(result);
    }
}
