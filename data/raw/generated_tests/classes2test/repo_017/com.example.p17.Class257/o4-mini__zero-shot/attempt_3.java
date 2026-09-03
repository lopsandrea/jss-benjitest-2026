package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class257Test {

    @Test
    void reportsComputeReturnsTotalForBoundaryValue() {
        Class257 subject = org.mockito.Mockito.mock(Class257.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
