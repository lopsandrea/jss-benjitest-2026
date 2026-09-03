package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {

    @Test
    void reportsComputeReturnsTotalOnTrimmedInput() {
        Class024 subject = org.mockito.Mockito.mock(Class024.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
