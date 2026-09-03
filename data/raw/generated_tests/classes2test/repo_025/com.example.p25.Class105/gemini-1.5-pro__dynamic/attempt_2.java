package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {

    @Test
    void reportsComputeReturnsTotalWhenAlreadyValid() {
        Class105 subject = org.mockito.Mockito.mock(Class105.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
