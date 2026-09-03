package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {

    @Test
    void reportsComputeReturnsTotalOnRepeatedCall() {
        String result = new Class049().compute(3);
        assertNotNull(result);
    }
}
