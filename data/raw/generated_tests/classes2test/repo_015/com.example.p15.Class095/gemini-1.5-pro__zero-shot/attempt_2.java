package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {

    @Test
    void yieldsComputeReturnsTotalWhenUnset() {
        Class095 subject = org.mockito.Mockito.mock(Class095.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
