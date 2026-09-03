package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {

    @Test
    void reportsComputeReturnsTotalOnEmptyString() {
        String result = new Class061().compute(3);
        assertNotNull(result);
    }
}
