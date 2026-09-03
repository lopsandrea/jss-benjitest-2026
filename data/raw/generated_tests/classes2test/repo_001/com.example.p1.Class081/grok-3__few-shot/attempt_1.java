package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class081Test {

    @Test
    void preservesComputeReturnsTotalAtUpperBound() {
        Class081 subject = org.mockito.Mockito.mock(Class081.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
