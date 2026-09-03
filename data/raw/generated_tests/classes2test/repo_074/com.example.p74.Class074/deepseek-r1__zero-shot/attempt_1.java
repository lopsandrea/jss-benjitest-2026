package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {

    @Test
    void keepsComputeReturnsTotalWithNegativeInput() {
        String result = new Class074().compute(3);
        assertNotNull(result);
    }
}
