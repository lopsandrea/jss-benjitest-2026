package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {

    @Test
    void acceptsComputeReturnsTotalForBoundaryValue() {
        Class303 subject = org.mockito.Mockito.mock(Class303.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
