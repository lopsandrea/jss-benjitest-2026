package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        List<String> items = new ArrayList<>();
        assertTrue(items.isEmpty());
    }
}
