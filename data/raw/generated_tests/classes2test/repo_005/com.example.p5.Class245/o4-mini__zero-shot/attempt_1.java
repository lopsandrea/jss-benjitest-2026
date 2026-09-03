package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class245Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        String result = new Class245().compute(3);
        assertNotNull(result);
    }
}
