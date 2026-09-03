package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class096Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        Class096 subject = org.mockito.Mockito.mock(Class096.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
