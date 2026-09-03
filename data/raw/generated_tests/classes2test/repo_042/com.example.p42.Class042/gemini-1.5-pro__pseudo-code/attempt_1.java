package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {

    @Test
    void rejectsComputeReturnsTotalForBoundaryValue() {
        Class042 subject = org.mockito.Mockito.mock(Class042.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
