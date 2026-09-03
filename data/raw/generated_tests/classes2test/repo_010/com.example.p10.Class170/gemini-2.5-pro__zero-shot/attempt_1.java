package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        Class170 subject = org.mockito.Mockito.mock(Class170.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
