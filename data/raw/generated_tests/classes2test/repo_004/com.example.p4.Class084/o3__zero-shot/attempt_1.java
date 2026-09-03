package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {

    @Test
    void keepsComputeReturnsTotalWhenUnset() {
        Class084 subject = org.mockito.Mockito.mock(Class084.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
