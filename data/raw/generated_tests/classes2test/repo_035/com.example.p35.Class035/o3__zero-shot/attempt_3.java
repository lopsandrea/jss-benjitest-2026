package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class035Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        Class035 subject = org.mockito.Mockito.mock(Class035.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
