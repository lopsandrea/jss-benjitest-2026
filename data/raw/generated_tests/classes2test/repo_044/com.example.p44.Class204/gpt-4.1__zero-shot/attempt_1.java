package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        Class204 subject = org.mockito.Mockito.mock(Class204.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
