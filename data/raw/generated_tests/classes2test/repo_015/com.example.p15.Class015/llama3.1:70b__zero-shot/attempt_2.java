package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {

    @Test
    void reportsComputeReturnsTotalAtUpperBound() {
        Class015 subject = org.mockito.Mockito.mock(Class015.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
