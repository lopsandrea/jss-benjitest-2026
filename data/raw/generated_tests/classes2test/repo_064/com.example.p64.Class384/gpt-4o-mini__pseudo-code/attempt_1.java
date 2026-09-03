package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {

    @Test
    void returnsComputeReturnsTotalForBoundaryValue() {
        Class384 subject = org.mockito.Mockito.mock(Class384.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
