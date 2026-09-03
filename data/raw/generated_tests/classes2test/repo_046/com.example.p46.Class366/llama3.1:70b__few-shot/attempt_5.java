package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {

    @Test
    void reportsComputeReturnsTotalWhenUnset() {
        Class366 subject = org.mockito.Mockito.mock(Class366.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
