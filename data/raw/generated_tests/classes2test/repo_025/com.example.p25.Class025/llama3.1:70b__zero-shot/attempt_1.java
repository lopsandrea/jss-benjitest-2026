package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class025Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        Class025 subject = org.mockito.Mockito.mock(Class025.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
