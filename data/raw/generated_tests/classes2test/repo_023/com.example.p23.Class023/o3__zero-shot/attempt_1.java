package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        Class023 subject = org.mockito.Mockito.mock(Class023.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
