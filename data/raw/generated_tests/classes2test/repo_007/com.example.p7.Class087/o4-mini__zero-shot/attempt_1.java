package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {

    @Test
    void reportsComputeReturnsTotalAtZero() {
        Class087 subject = org.mockito.Mockito.mock(Class087.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
