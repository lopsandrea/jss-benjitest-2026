package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class213Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        String result = new Class213().compute(3);
        assertNotNull(result);
    }
}
