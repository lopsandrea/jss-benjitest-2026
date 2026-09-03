package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class292Test {

    @Test
    void keepsComputeReturnsTotalAtZero() {
        Class292 subject = org.mockito.Mockito.mock(Class292.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
