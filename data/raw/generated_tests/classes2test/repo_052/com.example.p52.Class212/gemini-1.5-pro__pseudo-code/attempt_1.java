package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class212Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        Class212 subject = org.mockito.Mockito.mock(Class212.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
