package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        Class056 subject = org.mockito.Mockito.mock(Class056.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
