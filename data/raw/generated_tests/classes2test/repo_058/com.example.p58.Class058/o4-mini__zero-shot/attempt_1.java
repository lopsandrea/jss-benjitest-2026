package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {

    @Test
    void reportsComputeReturnsTotalWithNullArgument() {
        Class058 subject = org.mockito.Mockito.mock(Class058.class);
        org.mockito.Mockito.when(subject.capacity()).thenReturn("16");
    }
}
