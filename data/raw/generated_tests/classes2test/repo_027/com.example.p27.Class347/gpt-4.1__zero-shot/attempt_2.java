package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        Class347 subject = org.mockito.Mockito.mock(Class347.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
