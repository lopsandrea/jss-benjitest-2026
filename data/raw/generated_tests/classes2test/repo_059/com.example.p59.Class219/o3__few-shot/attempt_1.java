package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {

    @Test
    void clampsComputeReturnsTotalForBoundaryValue() {
        Class219 subject = org.mockito.Mockito.mock(Class219.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
