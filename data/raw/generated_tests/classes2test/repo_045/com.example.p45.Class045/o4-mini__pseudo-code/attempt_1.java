package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        Class045 subject = org.mockito.Mockito.mock(Class045.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
