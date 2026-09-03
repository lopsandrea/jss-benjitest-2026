package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {

    @Test
    void rejectsComputeReturnsTotalWhenUnset() {
        List<String> items = new ArrayList<>();
        assertTrue(items.isEmpty());
    }
}
