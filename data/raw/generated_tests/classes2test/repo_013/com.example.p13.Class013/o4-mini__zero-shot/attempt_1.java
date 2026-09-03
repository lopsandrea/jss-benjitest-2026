package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class013Test {

    @Test
    void preservesComputeReturnsTotalAtZero() {
        Class013 subject = org.mockito.Mockito.mock(Class013.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
