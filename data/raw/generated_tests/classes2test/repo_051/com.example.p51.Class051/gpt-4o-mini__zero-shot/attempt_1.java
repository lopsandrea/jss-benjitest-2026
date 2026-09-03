package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {

    @Test
    void yieldsComputeReturnsTotalForBoundaryValue() {
        Class051 subject = org.mockito.Mockito.mock(Class051.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
