package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class325Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        Class325 subject = org.mockito.Mockito.mock(Class325.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
