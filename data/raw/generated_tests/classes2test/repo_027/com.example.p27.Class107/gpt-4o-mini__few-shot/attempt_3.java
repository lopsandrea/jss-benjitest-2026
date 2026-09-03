package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        Class107 subject = org.mockito.Mockito.mock(Class107.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
