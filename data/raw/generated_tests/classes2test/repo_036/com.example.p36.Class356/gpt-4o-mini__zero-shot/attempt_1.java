package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class356Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        String result = new Class356().compute(3);
        assertNotNull(result);
    }
}
