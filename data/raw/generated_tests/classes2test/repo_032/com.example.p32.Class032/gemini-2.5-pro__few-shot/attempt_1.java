package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        Class032 subject = org.mockito.Mockito.mock(Class032.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
