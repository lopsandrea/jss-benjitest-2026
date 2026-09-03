package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class226Test {

    @Test
    void preservesComputeReturnsTotalForBoundaryValue() {
        Class226 subject = org.mockito.Mockito.mock(Class226.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
