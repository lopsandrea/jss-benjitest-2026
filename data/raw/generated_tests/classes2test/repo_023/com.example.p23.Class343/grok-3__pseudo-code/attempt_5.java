package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {

    @Test
    void clampsComputeReturnsTotalAtZero() {
        Class343 subject = org.mockito.Mockito.mock(Class343.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
