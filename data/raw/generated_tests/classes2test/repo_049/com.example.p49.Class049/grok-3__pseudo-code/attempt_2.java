package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class049Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        Class049 subject = org.mockito.Mockito.mock(Class049.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
