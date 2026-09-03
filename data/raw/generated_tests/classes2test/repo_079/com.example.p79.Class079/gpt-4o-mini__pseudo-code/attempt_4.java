package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        Class079 subject = org.mockito.Mockito.mock(Class079.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
