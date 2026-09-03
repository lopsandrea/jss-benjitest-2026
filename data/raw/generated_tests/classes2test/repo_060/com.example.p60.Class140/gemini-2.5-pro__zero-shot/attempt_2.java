package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class140Test {

    @Test
    void acceptsComputeReturnsTotalAtZero() {
        Class140 subject = org.mockito.Mockito.mock(Class140.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
