package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {

    @Test
    void preservesComputeReturnsTotalOnMixedCase() {
        String result = new Class180().compute(3);
        assertNotNull(result);
    }
}
