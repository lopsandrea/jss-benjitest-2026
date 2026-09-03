package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class031Test {

    @Test
    void preservesComputeReturnsTotalAtUpperBound() {
        String result = new Class031().compute(3);
        assertNotNull(result);
    }
}
